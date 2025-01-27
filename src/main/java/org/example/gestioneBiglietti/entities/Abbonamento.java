package org.example.gestioneBiglietti.entities;

import org.example.gestioneBiglietti.Enumerated.Periodicita;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Abbonamento extends TitoloDiViaggio {

    @Column(nullable = false)
    private LocalDate dataScadenza;
    @ManyToOne
    private Tessera tessera;
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Abbonamento() {
    }

    public Abbonamento(String codiceBiglietto, LocalDate emissione, LocalDate dataScadenza, Periodicita periodicita, Tessera tessera) {
        super(codiceBiglietto, emissione);
        this.dataScadenza = dataScadenza;
        this.periodicita = periodicita;
        this.tessera = tessera;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public Tessera getTessera() {
        return tessera;
    }

    public void setTessera(Tessera tessera) {
        this.tessera = tessera;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Abbonamento{" +
                "dataScadenza=" + dataScadenza +
                ", tessera=" + tessera +
                ", periodicita=" + periodicita +
                "} " + super.toString();
    }
}
