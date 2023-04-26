/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author 2021122760224
 */
public class Ingrediente {
    private int idIngrediente;
    private String nomeIngrediente;
    private Pizza pizza;

    public Ingrediente(int idIngrediente, String nomeIngrediente, Pizza idPizza) {
        this.idIngrediente = idIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.pizza = idPizza;
    }

    public Pizza getIdPizza() {
        return pizza;
    }

    public void setIdPizza(Pizza idPizza) {
        this.pizza = idPizza;
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
    
    
}
