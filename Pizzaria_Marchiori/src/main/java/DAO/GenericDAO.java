/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author luiz.marchiori
 */
public class GenericDAO {
    public void inserir(Object obj) throws HibernateException {        
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            sessao.save(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException ex) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }
    
    
    public void alterar(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            sessao.update(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException ex) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }
    
    public void excluir(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            sessao.delete(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException ex) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }
    
    
    public List listar(Class classe ) throws HibernateException {
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            Criteria consulta = sessao.createCriteria(classe);
            lista = consulta.list();
            
            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException ex) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            } throw new HibernateException(ex);
        }
        return lista;
    }
}
