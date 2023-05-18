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
public class Adicional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdicional;

    /*|-------------------| relacionamentos |-------------------|*/
    @ManyToMany
    @JoinTable(name = "ItensPedido_Adicional",
            joinColumns = @JoinColumn(name = "idAdicional"),
            inverseJoinColumns = @JoinColumn(name = "idItensPedido"))
    private List<ItensPedido> itenspedido = new ArrayList<>();

    /*@OneToMany (mappedBy = "idAdicional" , fetch = FetchType.LAZY)
    private ItensPedido itenspedido;*/

 /*|-------------------| relacionamentos |-------------------|*/
    @Column(name = "nomeAdicional", nullable = false)
    private String nome;

    @Column(name = "precoAdicional", nullable = false)
    private float preco;

    public Adicional() {
    }

    
    
    
    /*|-------------------| construtor |-------------------|*/
    public Adicional(int idAdicional, String nome, float preco) {
        this.idAdicional = idAdicional;
        this.nome = nome;
        this.preco = preco;
    }

    public Adicional(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    

    /*|-------------------| construtor |-------------------|*/
 /*|-------------------| getters & setters |-------------------|*/
    public List<ItensPedido> getItenspedido() {
        return itenspedido;
    }

    public void setItenspedido(List<ItensPedido> itenspedido) {
        this.itenspedido = itenspedido;
    }

    public int getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(int idAdicional) {
        this.idAdicional = idAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    /*|-------------------| getters & setters |-------------------|*/

    @Override
    public String toString() {
        return nome;
    }
    
    
}
