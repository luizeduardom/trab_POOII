package DAO;

import Dominio.Cliente;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 2021122760224
 */
public class GenericDAO {
    
    // Funcao para inserir genérica
    public void inserir(Object obj) throws HibernateException {

        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÃO DE SALVAR O OBJETO NO BANCO DE DADOS
            sessao.save(obj);

            // DANDO COMMIT NO BANCO DE DADOS
            sessao.getTransaction().commit();
            
            //FECHANDO A SESSAO
            sessao.close();
            
        // TRATANDO A EXCEÇÃO E DANDO ROLLBACK NA TRANSAÇÃO CASO FALHE
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }

    
    // Listar genérico
    public List listar(Class classe) throws HibernateException {
        Session sessao = null;
        List lista = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Cria uma consulta usando o criteriaQuery, e cria uma query da classe passada
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            
            // Fazendo uma consulta da classe
            consulta.from(classe);
            
            // Criando uma Query a partir da consulta criada pelo CriteriaQuery
            lista = sessao.createQuery(consulta).getResultList();

            // Dando commit na transação
            sessao.getTransaction().commit();
            
            // Fechando sessão
            sessao.close();
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }

    // Pesquisar a partir da String genérico.
    public List pesquisar(Class classe, String pesq) throws HibernateException {
        Session sessao = null;
        List lista = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Criando o construtor criteria e a consulta
            CriteriaBuilder construtorCriteria = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = construtorCriteria.createQuery(Cliente.class);

            // Tabela recebendo um root
            Root tabela = consulta.from(Cliente.class);
            
            // Variavel criada para criar as restricoes(Where)
            Predicate restricoes = null;
            
            // Definindo a minha clausula where
            restricoes = construtorCriteria.like(tabela.get("nome"), pesq + "%");
            
            // Fazendo a consulta recebendo as restricoes
            consulta.where(restricoes);
            lista = sessao.createQuery(consulta).getResultList();

            // Dando commit na transação
            sessao.getTransaction().commit();
            
            // Fechando a sessão
            sessao.close();
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }

    // Funcao para carregar uma classe utilizando o id
    public Object load(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            // Carrega da sessão o id da classe passada
            objReturn = sessao.load(classe, id);
            
            // Converte para string
            objReturn.toString();

            // Dando commit na transação
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
    
    // Excluindo um objeto
    public void excluir(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Excluindo um objeto do banco de dados
            sessao.delete(obj);

            // Dando commit na transação
            sessao.getTransaction().commit();  

            // Fechando a sessão
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
    
    // Funcao alterar 
     public void alterar(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Dando update no objeto passado
            sessao.update(obj);

            // Dando commit na transação
            sessao.getTransaction().commit();     
            
            // Fechando a sessão
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }

}
