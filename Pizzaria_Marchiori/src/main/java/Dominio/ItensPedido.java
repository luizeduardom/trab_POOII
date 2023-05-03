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
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idPizza")
    private Pizza pizza;
    
    @ManyToMany 
    @JoinTable (name = "ItensPedido_Adicional", 
            joinColumns = @JoinColumn (name = "idItensPedido"), 
            inverseJoinColumns = @JoinColumn (name = "idAdicional"))
    private List<Adicional> adicional = new ArrayList<>();
    /*@ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idAdicional")
    private List<Adicional> adicional;*/
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @Column(name = "quantidadePizza", nullable = false)
    private int qntd;
    
    
    /*|-------------------| construtor |-------------------|*/

    public ItensPedido(int idItensPedido, Pedido pedido, Pizza pizza, int qntd, Adicional adicional) {
        this.idItensPedido = idItensPedido;
        this.pedido = pedido;
        this.pizza = pizza;
        this.qntd = qntd;
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

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    
    /*|-------------------| getters & setters |-------------------|*/
}
