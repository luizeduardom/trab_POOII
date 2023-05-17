package Dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "nomeCliente", nullable = false)
    private String nome;

    @Column(name = "bairroCliente", nullable = false)
    private String bairro;

    @Column(name = "ruaCliente", nullable = false)
    private String rua;

    @Column(name = "numeroCliente", nullable = false)
    private int numero;

    @Column(name = "telefoneCliente", nullable = false)
    private long telefone;

    /*|-------------------| relacionamentos |-------------------|*/
    
    @OneToMany (mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Pedido> pedido = new ArrayList<>();
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    /*|-------------------| construtor |-------------------|*/
    
    public Cliente(String nome,  int numero, String bairro, String rua, long telefone) {
        this.nome = nome;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.telefone = telefone;
    }

    public Cliente() {
    }
    
    
    /*|-------------------| construtor |-------------------|*/

    
    /*|-------------------| getters & setters |-------------------|*/
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    /*|-------------------| Getters & Setters |-------------------|*/
    
    public Object[] toArray() throws ParseException {
        return new Object[] { this, bairro,  rua, numero, telefone };
    }
}
