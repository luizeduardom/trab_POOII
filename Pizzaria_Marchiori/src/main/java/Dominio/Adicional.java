package Dominio;


import java.io.Serializable;
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
    @OneToMany (mappedBy = "idAdicional" , fetch = FetchType.LAZY)
    private ItensPedido itenspedido;

    /*|-------------------| relacionamentos |-------------------|*/
    
    @Column(name = "nomeAdicional", nullable = false)
    private String nome;

    @Column(name = "precoAdicional", nullable = false)
    private float preco;

    /*|-------------------| construtor |-------------------|*/
    public Adicional(int idAdicional, String nome, float preco) {
        this.idAdicional = idAdicional;
        this.nome = nome;
        this.preco = preco;
    }

    /*|-------------------| construtor |-------------------|*/
    
 /*|-------------------| getters & setters |-------------------|*/

    public ItensPedido getItenspedido() {
        return itenspedido;
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
}
