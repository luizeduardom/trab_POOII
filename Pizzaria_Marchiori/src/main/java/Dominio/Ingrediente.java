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
public class Ingrediente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngrediente;

    @Column(name = "nomeIngrediente", nullable = false)
    private String nomeIngrediente;

    /*|-------------------| relacionamentos |-------------------|*/
    @ManyToMany
    @JoinTable(name = "Ingrediente_Pizza",
            joinColumns = @JoinColumn(name = "idIngrediente"),
            inverseJoinColumns = @JoinColumn(name = "idPizza"))
    private List<Pizza> pizza;

    /*|-------------------| relacionamentos |-------------------|*/

 /*|-------------------| construtor |-------------------|*/
    public Ingrediente(int idIngrediente, String nomeIngrediente) {
        this.idIngrediente = idIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.pizza = new ArrayList<>();
    }

    public Ingrediente() {
    }

    /*|-------------------| construtor |-------------------|*/

 /*|-------------------| getters & setters |-------------------|*/

    public List<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(List<Pizza> pizza) {
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
    @Override
    public String toString() {
        return nomeIngrediente;
    }

}
