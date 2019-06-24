package com.mycompany.projetofinalsds.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author raul
 */
@Entity
public class HotelQuarto implements Cadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_quarto")
    @SequenceGenerator(name = "gen_quarto", sequenceName = "seq_quarto",initialValue = 1)
    private long id;
    
    private int quartoNum;
    
    private String andar;
    
    private int totalCamas;
    
    private double preco;
    
    @ManyToOne
    private Hotel hotel;
    
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public int getQuartoNum() {
        return quartoNum;
    }

    public void setQuartoNum(int quartoNum) {
        this.quartoNum = quartoNum;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public int getTotalCamas() {
        return totalCamas;
    }

    public void setTotalCamas(int totalCamas) {
        this.totalCamas = totalCamas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


    
}
