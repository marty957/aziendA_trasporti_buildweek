package org.example.gestioneBiglietti.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipologia")
public class PuntoVendita {

    @Id
    @GeneratedValue
    private long id_punto_vendita;
    private String indirizzo;

    @ManyToMany
    @JoinTable(
            name = "titoli_di_viaggi_venduti",
            joinColumns = @JoinColumn(name = "titoloViaggio_id"),
            inverseJoinColumns = @JoinColumn(name = "puntovendita_id")
    )
    private List<TitoloDiViaggio> listaVendita=new ArrayList<>();

    public PuntoVendita() {
    }

    public PuntoVendita(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public long getId_punto_vendita() {
        return id_punto_vendita;
    }

    public void setId_punto_vendita(long id_punto_vendita) {
        this.id_punto_vendita = id_punto_vendita;
    }

    @Override
    public String toString() {
        return "PuntoVendita{" +
                "id_punto_vendita=" + id_punto_vendita +
                ", indirizzo='" + indirizzo + '\'' +
                ", listaVendita=" + listaVendita +
                '}';
    }
}
