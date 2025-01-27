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

    public Tessera(String nome, String cognome, LocalDate emissione, LocalDate scadenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.emissione = emissione;
        this.scadenza = scadenza;
    }
}
