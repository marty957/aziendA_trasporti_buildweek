package org.example.gestioneBiglietti.entities;


import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Biglietto extends TitoloDiViaggio {

    boolean statoBiglietto;

    public Biglietto() {
    }

    public Biglietto(String codiceBiglietto, LocalDate emissione, PuntoVendita neg, boolean statoBiglietto) {
        super(codiceBiglietto, emissione, neg);
        this.statoBiglietto = statoBiglietto;
    }

    public boolean isStatoBiglietto() {
        return statoBiglietto;
    }

    public void setStatoBiglietto(boolean statoBiglietto) {
        this.statoBiglietto = statoBiglietto;
    }

    @Override
    public String toString() {
        return "Biglietto{" +
                "statoBiglietto=" + statoBiglietto +
                "} " + super.toString();
    }
}
