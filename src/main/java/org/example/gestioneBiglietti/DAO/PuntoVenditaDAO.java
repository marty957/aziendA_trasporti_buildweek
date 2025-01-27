package org.example.gestioneBiglietti.DAO;

import org.example.gestioneBiglietti.entities.PuntoVendita;

import javax.persistence.EntityManager;

public class PuntoVenditaDAO {
    private EntityManager em;

    public PuntoVenditaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(PuntoVendita p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
}
