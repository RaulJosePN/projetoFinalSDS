package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author raul
 */
@Entity
public class Piloto implements Cadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "piloto_gen")
    @SequenceGenerator(name = "piloto_gen", sequenceName = "piloto_seq", initialValue = 1)
    private long id;
    
    private String nome;
    
    @OneToMany(mappedBy = "piloto", fetch = FetchType.EAGER)
    private List <Voo> voos;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoos(List <Voo> voos) {
        this.voos = voos;
    }
    
}
