package org.example.gestioneBiglietti.entities;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Utente {

    @Id
    @GeneratedValue
    private long id_utente;

    public Utente() {
    }

    public long getId_utente() {
        return id_utente;
    }

    public void setId_utente(long id_utente) {
        this.id_utente = id_utente;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id_utente=" + id_utente +
                '}';
    }

}
