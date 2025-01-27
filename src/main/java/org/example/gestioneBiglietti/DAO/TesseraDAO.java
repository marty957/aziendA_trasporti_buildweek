package org.example.gestioneBiglietti.DAO;

import org.example.gestioneBiglietti.entities.Tessera;

import javax.persistence.EntityManager;

public class TesseraDAO {
    private EntityManager em;

    public TesseraDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Tessera t){
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

}
