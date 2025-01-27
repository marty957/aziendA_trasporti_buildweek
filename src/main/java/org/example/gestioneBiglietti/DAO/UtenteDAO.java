package org.example.gestioneBiglietti.DAO;

import org.example.gestioneBiglietti.entities.Utente;

import javax.persistence.EntityManager;

public class UtenteDAO {
    private EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Utente u){
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }
}
