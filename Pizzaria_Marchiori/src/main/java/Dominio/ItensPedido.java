
package Dominio;

import java.util.List;

public class ItensPedido {
    private int idItensPedido;
    private Pedido pedido;
    private Pizza pizza;
    private int qntd;
    private List<String> adicional;

    public ItensPedido(int idItensPedido, Pedido pedido, Pizza pizza, int qntd, List<String> adicional) {
        this.idItensPedido = idItensPedido;
        this.pedido = pedido;
        this.pizza = pizza;
        this.qntd = qntd;
        this.adicional = adicional;
    }

    public int getIdItensPedido() {
        return idItensPedido;
    }

    public void setIdItensPedido(int idItensPedido) {
        this.idItensPedido = idItensPedido;
    }

    public Pedido getIdPedido() {
        return pedido;
    }

    public void setIdPedido(Pedido pedido) {
        this.pedido = pedido;
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
    
    
}
