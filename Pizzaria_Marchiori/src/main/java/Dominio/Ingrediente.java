package Dominio;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author luiz.marchiori
 */

@Entity
public class Ingrediente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngrediente;
    
    @Column(name = "nomeIngrediente", nullable = false)
    private String nomeIngrediente;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idPizza")
    private Pizza pizza;
    
    /*|-------------------| relacionamentos |-------------------|*/

    /*|-------------------| construtor |-------------------|*/
    
    public Ingrediente(int idIngrediente, String nomeIngrediente, Pizza pizza) {
        this.idIngrediente = idIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.pizza = pizza;
    }
    
    /*|-------------------| construtor |-------------------|*/

    /*|-------------------| getters & setters |-------------------|*/
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    /*|-------------------| getters & setters |-------------------|*/
}
