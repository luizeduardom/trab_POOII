package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author luiz.marchiori
 */
@Entity
public class ItensPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItensPedido;

    /*|-------------------| relacionamentos |-------------------|*/
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPedido")
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPizza")
    private Pizza pizza;

    @Column(name = "tamanho", nullable = false, length = 1)
    private char tamanho;

    @ManyToMany
    @JoinTable(name = "ItensPedido_Adicional",
            joinColumns = @JoinColumn(name = "idItensPedido"),
            inverseJoinColumns = @JoinColumn(name = "idAdicional"))
    private List<Adicional> adicional = new ArrayList<>();


    /*|-------------------| relacionamentos |-------------------|*/
 /*|-------------------| construtor |-------------------|*/
    public ItensPedido(int idItensPedido, Pedido pedido, Pizza pizza, char tamanho) {
        this.idItensPedido = idItensPedido;
        this.pedido = pedido;
        this.pizza = pizza;
        this.tamanho = tamanho;
    }

    public ItensPedido(Pizza pizza, Pedido pedido, char tamanho, List<Adicional> adicionais) {
        this.pedido = pedido;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.adicional = adicionais;
    }

    public ItensPedido() {
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    /*|-------------------| construtor |-------------------|*/
 /*|-------------------| getters & setters |-------------------|*/
    public List<Adicional> getAdicional() {
        return adicional;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getIdItensPedido() {
        return idItensPedido;
    }

    public void setIdItensPedido(int idItensPedido) {
        this.idItensPedido = idItensPedido;
    }
    /*|-------------------| getters & setters |-------------------|*/

    @Override
    public String toString() {
        return " idItemPedido= " + idItensPedido + " || " + pedido + " || Pizza = " + pizza + " || Tamanho = " + tamanho;
    }

    
}
