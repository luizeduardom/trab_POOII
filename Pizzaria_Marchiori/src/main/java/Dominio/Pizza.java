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
public class Pizza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizza;

    /*|-------------------| relacionamentos |-------------------|*/
    @OneToMany(mappedBy = "pizza", fetch = FetchType.LAZY)
    private List<ItensPedido> itensPedido;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Ingrediente_Pizza",
            joinColumns = @JoinColumn(name = "idPizza"),
            inverseJoinColumns = @JoinColumn(name = "idIngrediente"))
    private List<Ingrediente> ingrediente;

    /*|-------------------| relacionamentos |-------------------|*/
    @Column(name = "nomePizza", nullable = false)
    private String nomePizza;

    @Column(name = "valorPizza", nullable = false)
    private float valorPizza;

    /*|-------------------| construtor |-------------------|*/
    public Pizza() {
    }

    public Pizza(int idPizza, String nomePizza, float valorPizza) {
        this.idPizza = idPizza;
        this.nomePizza = nomePizza;
        this.valorPizza = valorPizza;
        this.itensPedido = new ArrayList();
        this.ingrediente = new ArrayList();
    }

    public Pizza(String nomePizza, float valorPizza) {
        this.nomePizza = nomePizza;
        this.valorPizza = valorPizza;
        this.itensPedido = new ArrayList();
        this.ingrediente = new ArrayList();
    }

    public Pizza(List<Ingrediente> ingrediente, String nomePizza, float valorPizza) {
        this.ingrediente = ingrediente;
        this.nomePizza = nomePizza;
        this.valorPizza = valorPizza;
    }
    
    

    /*|-------------------| construtor |-------------------|*/

 /*|-------------------| getters & setters |-------------------|*/
    public List<ItensPedido> getItensPedido() {
        return itensPedido;
    }

    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public List<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public float getValorPizza() {
        return valorPizza;
    }

    public void setValorPizza(float valorPizza) {
        this.valorPizza = valorPizza;
    }

    /*|-------------------| getters & setters |-------------------|*/
    @Override
    public String toString() {
        return nomePizza + " ( " + valorPizza + " )";
    }

}
