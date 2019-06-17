package com.mycompany.projetofinalsds.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author raul
 */
@Entity
public class Hotel implements Cadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @ManyToOne
    private Bairro bairro;
    
    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    private List<HotelQuarto> quartosDeHotel;

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

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public void setQuartosDeHotel(List<HotelQuarto> quartosDeHotel) {
        this.quartosDeHotel = quartosDeHotel;
    }

}
