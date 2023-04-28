/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author luiz.marchiori
 */

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    
    @OneToMany (mappedBy = "itensPedido", fetch = FetchType.LAZY)
    @JoinColumn(name= "idItensPedido")
    private ItensPedido itenspedido;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @Column(name = "entrega", nullable = false)
    private boolean entrega;
    
    @Column(name = "valorTotal", nullable = false)
    private float valorTotal;

    /*|-------------------| construtor |-------------------|*/
    
    public Pedido(int idPedido, Cliente cliente, boolean entrega, float valorTotal, ItensPedido itenspedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.entrega = entrega;
        this.valorTotal = valorTotal;
        this.itenspedido = itenspedido;
    }
    
    /*|-------------------| construtor |-------------------|*/
    
    /*|-------------------| getters & setters |-------------------|*/

    public ItensPedido getItenspedido() {
        return itenspedido;
    }

    public void setItenspedido(ItensPedido itenspedido) {
        this.itenspedido = itenspedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente idCliente) {
        this.cliente = idCliente;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

     /*|-------------------| getters & setters |-------------------|*/
}
