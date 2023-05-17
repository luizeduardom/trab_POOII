/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */
public class ClienteDAO extends GenericDAO {

    public List<Cliente> pesquisarNome(String pesq) throws HibernateException {
        return listar(Cliente.class);
    }

}
