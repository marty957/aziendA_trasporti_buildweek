package org.example.gestioneBiglietti.DAO;

import org.example.gestioneBiglietti.entities.TitoloDiViaggio;

import javax.persistence.EntityManager;

public class TitoloDiViaggioDAO {
    private EntityManager em;

    public TitoloDiViaggioDAO(EntityManager em) {
        this.em = em;
    }

    public void save(TitoloDiViaggio t){
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
}
