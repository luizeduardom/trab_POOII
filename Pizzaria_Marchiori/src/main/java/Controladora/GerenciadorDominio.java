package Controladora;

import DAO.ClienteDAO;
import DAO.ConexaoHibernate;
import DAO.GenericDAO;
import Dominio.Adicional;
import Dominio.Cliente;
import Dominio.ItensPedido;
import Dominio.Pedido;
import Dominio.Pizza;
import java.util.List;
import javax.swing.JTable;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */
public class GerenciadorDominio {

    GenericDAO genDao;
    ClienteDAO cliDao;

    public GerenciadorDominio() throws HibernateException {
        // TESTE
        ConexaoHibernate.getSessionFactory();
        genDao = new GenericDAO();
        cliDao = new ClienteDAO();
    }

    public List listar(Class classe) throws HibernateException {
        return genDao.listar(classe);

    }
    

    public int inserirCliente(String nome, int numero, String bairro, String rua, long telefone) throws HibernateException {
        Cliente cli = new Cliente(nome, numero, bairro, rua, telefone);
        genDao.inserir(cli);
        return cli.getIdCliente();
    }

    public List<Cliente> pesquisarCliente(String pesq) throws HibernateException {
        List<Cliente> lista = null;
        lista = cliDao.pesquisarNome(pesq);
        return lista;

    }

    public void alterarCliente(Cliente cli, String nome, int numero, String bairro, String rua, long telefone) throws HibernateException {

    }

    public Adicional getAdicional(int id) {

        return (Adicional) genDao.load(Adicional.class, id);
    }
    
    public Cliente getCliente(int id) {

        return (Cliente) genDao.load(Cliente.class, id);
    }

    public int inserirPedido(Cliente cli, int entrega, double total, JTable tblPedidos) {
        Pedido pedido = new Pedido(cli, entrega, total);
        List<ItensPedido> itens = pedido.getItenspedido();

        int tam = tblPedidos.getRowCount();
        if (tam > 0) {
            for (int lin = 0; lin < tam; lin++) {
                int col = 0;
                Pizza pizza = (Pizza) tblPedidos.getValueAt(lin, col++);
                char tamanho = (char) tblPedidos.getValueAt(lin, col++);
                List<Adicional> adicionais = (List<Adicional>) tblPedidos.getValueAt(lin, col++);
                ItensPedido item = new ItensPedido(pizza, pedido, tamanho, adicionais);

                itens.add(item);
            }
            genDao.inserir(pedido);
            return pedido.getIdPedido();
        } else {
            return -1;
        }

    }
    
        public void carregarPedidos(Cliente cli) {
        cliDao.carregarPedidos(cli);
    }

}
