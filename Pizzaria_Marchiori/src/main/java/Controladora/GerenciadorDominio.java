package Controladora;

import DAO.GenericDAO;
import dao.ConexaoHibernate;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */
public class GerenciadorDominio {
    
    GenericDAO genDao = null;
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        ConexaoHibernate.getSessionFactory();
    }
    
    public List listar(Class classe) throws HibernateException {        
        return genDao.listar(classe);        
    }
    
    public void excluir (Object obj) throws HibernateException {
        genDao.excluir(obj);
    }
    
    
}
