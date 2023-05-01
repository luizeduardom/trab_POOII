package Controladora;

import dao.ConexaoHibernate;
import java.sql.SQLException;

/**
 *
 * @author luiz.marchiori
 */
public class GerenciadorDominio {
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        ConexaoHibernate.getSessionFactory();
    }
}
