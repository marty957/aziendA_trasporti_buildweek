package org.example.gestioneBiglietti.entities;

import javax.persistence.Entity;

@Entity
public class RivenditoreAutorizzato extends PuntoVendita {
    private String nomeAttivita;

    public RivenditoreAutorizzato() {
    }

    public RivenditoreAutorizzato(String indirizzo, String nomeAttivita) {
        super(indirizzo);
        this.nomeAttivita = nomeAttivita;
    }

    public String getNomeAttivita() {
        return nomeAttivita;
    }

    public void setNomeAttivita(String nomeAttivita) {
        this.nomeAttivita = nomeAttivita;
    }

    @Override
    public String toString() {
        return "RivenditoreAutorizzato{" +
                "nomeAttivita='" + nomeAttivita + '\'' +
                "} " + super.toString();
    }
}
