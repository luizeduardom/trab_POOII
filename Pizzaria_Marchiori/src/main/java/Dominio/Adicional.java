/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;


import javax.persistence.*;

/**
 *
 * @author luiz.marchiori
 */

@Entity
public class Adicional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdicional;

    /*|-------------------| relacionamentos |-------------------|*/
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idItensPedido")
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
