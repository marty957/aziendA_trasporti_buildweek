package org.example.gestioneBiglietti.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class TitoloDiViaggio {

    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String codiceBiglietto;
    @Column(nullable = false)
    private LocalDate emissione;

    @ManyToMany(mappedBy = "listaVendita")
    private List<PuntoVendita> puntoVendita=new ArrayList<>();

    public TitoloDiViaggio() {
    }

    public TitoloDiViaggio(String codiceBiglietto, LocalDate emissione) {
        this.codiceBiglietto = codiceBiglietto;
        this.emissione = emissione;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodiceBiglietto() {
        return codiceBiglietto;
    }

    public void setCodiceBiglietto(String codiceBiglietto) {
        this.codiceBiglietto = codiceBiglietto;
    }

    public LocalDate getEmissione() {
        return emissione;
    }

    public void setEmissione(LocalDate emissione) {
        this.emissione = emissione;
    }

    public List<PuntoVendita> getPuntoVendita() {
        return puntoVendita;
    }

    public void setPuntoVendita(List<PuntoVendita> puntoVendita) {
        this.puntoVendita = puntoVendita;
    }

    @Override
    public String toString() {
        return "TitoloDiViaggio{" +
                "id=" + id +
                ", codiceBiglietto='" + codiceBiglietto + '\'' +
                ", emissione=" + emissione +
                ", puntoVendita=" + puntoVendita +
                '}';
    }
}
