package Controladora;

import DAO.ConexaoHibernate;
import DAO.GenericDAO;
import java.sql.SQLException;
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
        System.out.println("falhei no generic");
        return genDao.listar(classe);

    }

}
