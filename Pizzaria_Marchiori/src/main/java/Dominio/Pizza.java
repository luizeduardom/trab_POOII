/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.List;



public class Pizza {
    private int idPizza;
    private ItensPedido itensPedido;
    private String nomePizza;
    private List<Ingrediente> ingrediente;
    private float valorPizza;

    public ItensPedido getIdItensPedido() {
        return itensPedido;
    }

    public void setIdItensPedido(ItensPedido itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Pizza(int idPizza, ItensPedido idItensPedido, String nomePizza, List<Ingrediente> ingrediente, float valorPizza) {
        this.idPizza = idPizza;
        this.nomePizza = nomePizza;
        this.ingrediente = ingrediente;
        this.valorPizza = valorPizza;
        this.itensPedido = idItensPedido;
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
    
    
    
}
