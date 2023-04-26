/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author luiz.marchiori
 */
public class Pedido {
    
    private int idPedido;
    private Cliente cliente;
    private boolean entrega;
    private float valorTotal;

    public Pedido(int idPedido, Cliente cliente, boolean entrega, float valorTotal) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.entrega = entrega;
        this.valorTotal = valorTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getIdCliente() {
        return cliente;
    }

    public void setIdCliente(Cliente idCliente) {
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
    
    
    
    
    
}
