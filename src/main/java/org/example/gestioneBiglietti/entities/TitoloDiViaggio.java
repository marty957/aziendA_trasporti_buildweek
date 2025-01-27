package org.example.gestioneBiglietti.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@NamedQuery(name = "TitoloDiViaggio.bigiettiEmessi", query = "SELECT neg FROM TitoloDiViaggi t "+
//"WHERE t.emissione BETWEEN 2024/06/12 AND CURRENT_DATE")
public abstract  class TitoloDiViaggio {

    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String codiceBiglietto;
    @Column(nullable = false)
    private LocalDate emissione;
    @ManyToOne
    @JoinColumn(name = "puntovendita_id", nullable = false)
    private PuntoVendita neg;


    public TitoloDiViaggio() {
    }

    public TitoloDiViaggio(String codiceBiglietto, LocalDate emissione, PuntoVendita neg) {
        this.codiceBiglietto = codiceBiglietto;
        this.emissione = emissione;
        this.neg = neg;
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

    public PuntoVendita getNeg() {
        return neg;
    }

    public void setNeg(PuntoVendita neg) {
        this.neg = neg;
    }




    @Override
    public String toString() {
        return "TitoloDiViaggio{" +
                "id=" + id +
                ", codiceBiglietto='" + codiceBiglietto + '\'' +
                ", emissione=" + emissione +
                ", neg=" + neg +
                '}';
    }
}
