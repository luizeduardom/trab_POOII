package Dominio;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author luiz.marchiori
 */

@Entity
public class Cliente {

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
    
    @OneToMany (mappedBy = "pedido", fetch = FetchType.LAZY)
    @JoinColumn(name = "idPedido")
    private List<Pedido> pedido;
    
    /*|-------------------| relacionamentos |-------------------|*/
    
    /*|-------------------| construtor |-------------------|*/
    
    public Cliente(int idCliente, String nome, String bairro, String rua, int numero, long telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.telefone = telefone;
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
}
