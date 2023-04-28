package Dominio;

import java.util.ArrayList;
import java.util.List;
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
    
    @OneToMany (mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<ItensPedido> itenspedido;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @Column(name = "entrega", nullable = false)
    private boolean entrega;
    
    @Column(name = "valorTotal", nullable = false)
    private float valorTotal;

    /*|-------------------| construtor |-------------------|*/
    
    public Pedido(int idPedido, Cliente cliente, boolean entrega, float valorTotal) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.entrega = entrega;
        this.valorTotal = valorTotal;
    }
    
    /*|-------------------| construtor |-------------------|*/
    
    /*|-------------------| getters & setters |-------------------|*/

    public List<ItensPedido> getItenspedido() {
        return itenspedido;
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
