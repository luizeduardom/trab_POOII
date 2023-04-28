package Dominio;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author luiz.marchiori
 */

@Entity
public class ItensPedido {
    
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
    
    @OneToMany (mappedBy = "itenspedido" , fetch = FetchType.LAZY)
    private List<Adicional> adicional;
    
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
