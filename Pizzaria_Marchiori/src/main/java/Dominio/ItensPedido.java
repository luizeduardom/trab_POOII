
package Dominio;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @Column(name = "quantidadePizza", nullable = false)
    private int qntd;
    
    @Column(name = "adicionalPizza", nullable = false)
    private List<String> adicional;
    
    /*|-------------------| construtor |-------------------|*/

    public ItensPedido(int idItensPedido, Pedido pedido, Pizza pizza, int qntd, List<String> adicional) {
        this.idItensPedido = idItensPedido;
        this.pedido = pedido;
        this.pizza = pizza;
        this.qntd = qntd;
        this.adicional = adicional;
    }
    
     /*|-------------------| construtor |-------------------|*/
    
     /*|-------------------| getters & setters |-------------------|*/

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

    public List<String> getAdicional() {
        return adicional;
    }

    public void setAdicional(List<String> adicional) {
        this.adicional = adicional;
    }
    
    /*|-------------------| getters & setters |-------------------|*/
}
