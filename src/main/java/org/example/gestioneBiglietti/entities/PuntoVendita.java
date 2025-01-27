package org.example.gestioneBiglietti.entities;

import javax.persistence.*;
import java.time.LocalDate;
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

    @OneToMany(mappedBy = "neg")
    private List<TitoloDiViaggio> listaVendita = new ArrayList<>();

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

    public List<TitoloDiViaggio> getListaVendita() {
        return listaVendita;
    }

    public void setListaVendita(List<TitoloDiViaggio> listaVendita) {
        this.listaVendita = listaVendita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int bigliettiEmessi( LocalDate inizio, LocalDate fine){
       return(int) listaVendita.stream().filter(ele->ele.getEmissione().isAfter(inizio)&&
                ele.getEmissione().isBefore(fine)).count();
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
