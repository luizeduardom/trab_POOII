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

    // Funcao genérica listar
    public List listar(Class classe) throws HibernateException {
        return genDao.listar(classe);

    }

    // Inserindo cliente no banco de dados
    public int inserirCliente(String nome, int numero, String bairro, String rua, long telefone) throws HibernateException {
        Cliente cli = new Cliente(nome, numero, bairro, rua, telefone);
        genDao.inserir(cli);
        return cli.getIdCliente();
    }

    // Pesquisando cliente 
    public List<Cliente> pesquisarCliente(String pesq) throws HibernateException {
        List<Cliente> lista = null;
        lista = cliDao.pesquisarNome(pesq);
        return lista;

    }

    // Excluindo o objeto cliente
    public void excluirCliente(Object obj) throws HibernateException {
        genDao.excluir(obj);
    }

    // Alterando o cliente a partir de um já inserido.
    public void alterarCliente(Cliente cli, String nome, int numero, String bairro, String rua, long telefone) throws HibernateException {
        cli.setNome(nome);
        cli.setNumero(numero);
        cli.setBairro(bairro);
        cli.setRua(rua);
        cli.setTelefone(telefone);

        cliDao.alterar(cli);
    }

    // Funcao para carregar um adicional do banco de dados
    public Adicional getAdicional(int id) {

        return (Adicional) genDao.load(Adicional.class, id);
    }

    // Funcao para pegar o cliente pelo id
    public Cliente getCliente(int id) {

        return (Cliente) genDao.load(Cliente.class, id);
    }

    // Inserindo pedido feito pelo cliente, recebendo de parametro o objeto cliente, entrega, o total do pedido, a tabela dos pedidos e a observação da pizza
    public int inserirPedido(Cliente cli, int entrega, double total, JTable tblPedidos, String observacao) {

        // Cria um novo objeto pedido para ser inserido no banco de dados
        Pedido pedido = new Pedido(cli, entrega, total, observacao);

        // Cria uma Lista de ItensPedidos para ser inserida no banco de dados
        List<ItensPedido> itens = pedido.getItenspedido();

        // Pega o tamanho da tabela
        int tam = tblPedidos.getRowCount();

        // Se o tamanho da tabela for maior que 0 (ou seja, haja pedido)
        if (tam > 0) {

            // Pega os valores da tabela e adiciona no banco de dados
            for (int lin = 0; lin < tam; lin++) {
                int col = 0;
                Pizza pizza = (Pizza) tblPedidos.getValueAt(lin, col++);
                char tamanho = (char) tblPedidos.getValueAt(lin, col++);
                col++;
                List<Adicional> adicionais = (List<Adicional>) tblPedidos.getValueAt(lin, col++);
                ItensPedido item = new ItensPedido(pizza, pedido, tamanho, adicionais);
                itens.add(item);
            }

            // Chama a funcao genérica de inserir pedido
            genDao.inserir(pedido);

            // Retorna o id do pedido adicionado
            return pedido.getIdPedido();
        } else {
            return -1;
        }

    }
    
    // Carrega os pedidos do cliente
    public void carregarPedidos(Cliente cli) {
        cliDao.carregarPedidos(cli);
    }

}
