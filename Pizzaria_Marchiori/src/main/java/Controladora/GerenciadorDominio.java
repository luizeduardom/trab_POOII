package Controladora;

import DAO.ConexaoHibernate;
import DAO.GenericDAO;
import Dominio.Cliente;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */
public class GerenciadorDominio {

    GenericDAO genDao;

    public GerenciadorDominio() throws HibernateException {
        // TESTE
        ConexaoHibernate.getSessionFactory();
        genDao = new GenericDAO();
    }

    public List listar(Class classe) throws HibernateException {
        return genDao.listar(classe);

    }
    
    public int inserirCliente ( String nome,  int numero, String bairro, String rua, long telefone) throws HibernateException {
        Cliente cli = new Cliente(nome, numero, bairro, rua, telefone);
        genDao.inserir(cli);
        return cli.getIdCliente();
    }
    
   
    public void alterarCliente(Cliente cli, String nome,  int numero, String bairro, String rua, long telefone) throws HibernateException   {

           
    }

}
