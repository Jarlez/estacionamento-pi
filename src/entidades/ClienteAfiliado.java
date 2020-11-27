package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClienteAfiliado implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id = null;
    private String nome;
    private String cpf;
    private String contato;
    private String alocar;

    public String getAlocar() {
        return alocar;
    }

    public void setAlocar(String alocar) {
        this.alocar = alocar;
    }

    public ClienteAfiliado() {

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
