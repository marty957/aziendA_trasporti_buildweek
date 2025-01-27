package org.example.gestioneBiglietti.DAO;

import org.example.gestioneBiglietti.entities.TitoloDiViaggio;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

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

//    public List<TitoloDiViaggio> bigliettiEmessi(){
//        Query q= em.createNamedQuery();
//    }
}
