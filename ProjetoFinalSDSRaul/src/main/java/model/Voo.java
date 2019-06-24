package model;

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
public class Voo implements Cadastro, Serializable {

    @ManyToOne
    private Cidade cidadeDestino;

    @ManyToOne
    private Cidade cidadeOrigem;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "voo_gen")
    @SequenceGenerator(name = "voo_gen", sequenceName = "voo_seq", initialValue = 1)
    long id;

    @ManyToOne
    private Aviao aviao;

    @ManyToOne
    private Piloto piloto;

    @ManyToOne
    private CompanhiaAerea companhia;

    private String dataPartida;
    private double preco;
    private String dataChegada;
    private String numeroVoo;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataHoraPartida) {
        this.dataPartida = dataHoraPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataHoraChegada) {
        this.dataChegada = dataHoraChegada;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
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

    public Cidade getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(Cidade cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public Cidade getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(Cidade cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }
}
