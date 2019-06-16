package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author raul
 */
@Entity
public class Voo implements Cadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToOne
    private Cidade cidadeOrigem;

    @OneToOne
    private Cidade cidadeDestino;

    @OneToOne
    private Aviao aviao;

    @OneToOne
    private Piloto piloto;

    @OneToOne
    private CompanhiaAerea companhia;

    private String dataHoraPartida;
    private double preço;
    private String dataHoraChegada;
    private String numeroDoVoo;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Cidade getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(Cidade cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public Cidade getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(Cidade cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(String dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public CompanhiaAerea getCompanhia() {
        return companhia;
    }

    public void setCompanhia(CompanhiaAerea companhia) {
        this.companhia = companhia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
