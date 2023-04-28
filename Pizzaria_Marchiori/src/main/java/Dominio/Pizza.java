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
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizza;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @OneToMany (mappedBy = "itensPedido", fetch = FetchType.LAZY)
    @JoinColumn(name = "idItensPedido")
    private ItensPedido itensPedido;
    
    @OneToMany (mappedBy = "ingrediente", fetch = FetchType.LAZY)
    @JoinColumn(name = "idIngrediente")
    private List<Ingrediente> ingrediente;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    @Column(name = "nomePizza", nullable = false)
    private String nomePizza;
    
    @Column(name = "valorPizza", nullable = false)
    private float valorPizza;

    /*|-------------------| construtor |-------------------|*/
    
    public Pizza(int idPizza, ItensPedido ItensPedido, String nomePizza, List<Ingrediente> ingrediente, float valorPizza) {
        this.idPizza = idPizza;
        this.nomePizza = nomePizza;
        this.ingrediente = ingrediente;
        this.valorPizza = valorPizza;
        this.itensPedido = ItensPedido;
    }
    
    /*|-------------------| construtor |-------------------|*/

    /*|-------------------| getters & setters |-------------------|*/
    
    public ItensPedido getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ItensPedido itensPedido) {
        this.itensPedido = itensPedido;
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
}
