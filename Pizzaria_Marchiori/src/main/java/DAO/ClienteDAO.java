/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import Dominio.Pedido;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author luiz.marchiori
 */
public class ClienteDAO extends GenericDAO {

    public List<Cliente> pesquisarNome(String pesq) throws HibernateException {
        return pesquisar(Cliente.class, pesq);
    }

    public void carregarPedidos(Cliente cli) {
        Session sessao = null;

        try {

            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Verifica se a lista JÁ FOI CARREGADA
            if (!Hibernate.isInitialized(cli.getPedido())) {

                // Carrega o PROXY para outro objeto
                Cliente cliTemp = sessao.get(Cliente.class, cli.getIdCliente());

                // Carrega a lista de PEDIDOS
                List<Pedido> lista = cliTemp.getPedido();
                lista.size();

                // Atualiza a lista no OBJETO principal (parâmetro)
                cli.setPedido(lista);
            }

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
}
