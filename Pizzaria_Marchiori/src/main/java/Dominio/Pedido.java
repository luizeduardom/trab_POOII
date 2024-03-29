package Dominio;

import java.io.Serializable;
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
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    /*|-------------------| relacionamentos |-------------------|*/
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ItensPedido> itenspedido = new ArrayList<>();

    /*|-------------------| relacionamentos |-------------------|*/
    @Column(name = "entrega", nullable = false)
    private int entrega;

    @Column(name = "valorTotal", nullable = false)
    private double valorTotal;

    @Column(name = "observacao", nullable = true)
    private String observacao;
    

    /*|-------------------| construtor |-------------------|*/
    public Pedido(int idPedido, Cliente cliente, int entrega, double valorTotal, String observacao) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.entrega = entrega;
        this.valorTotal = valorTotal;
        this.observacao = observacao;
    }

    public Pedido(Cliente cliente, int entregar, double valorTotal, String observacao) {
        this.entrega = entregar;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.itenspedido = new ArrayList();
        this.observacao = observacao;
    }

    public Pedido() {
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

    public int isEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return ": " + "entrega = " + entrega + " || valorTotal = " + valorTotal + " || observacao = " + observacao + '}';
    }

    
    
    
}



/*|-------------------| getters & setters |-------------------|*/
