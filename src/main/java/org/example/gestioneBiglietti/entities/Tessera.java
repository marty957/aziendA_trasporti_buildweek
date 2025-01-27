package org.example.gestioneBiglietti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Tessera extends Utente {

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    @Column(nullable = false)
    private LocalDate emissione;
    private LocalDate scadenza;

    @OneToMany(mappedBy = "tessera")
    private List<Abbonamento> listaAbbonamenti= new ArrayList<>();


    public Tessera() {
    }

    public Tessera(String nome, String cognome, LocalDate emissione) {
        this.nome = nome;
        this.cognome = cognome;
        this.emissione = emissione;
        scadenza = emissione.plusDays(365);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getEmissione() {
        return emissione;
    }

    public void setEmissione(LocalDate emissione) {
        this.emissione = emissione;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public List<Abbonamento> getListaAbbonamenti() {
        return listaAbbonamenti;
    }

    public void setListaAbbonamenti(List<Abbonamento> listaAbbonamenti) {
        this.listaAbbonamenti = listaAbbonamenti;
    }

    @Override
    public String toString() {
        return "Tessera{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", emissione=" + emissione +
                ", scadenza=" + scadenza +
                ", listaAbbonamenti=" + listaAbbonamenti +
                "} " + super.toString();
    }
}
