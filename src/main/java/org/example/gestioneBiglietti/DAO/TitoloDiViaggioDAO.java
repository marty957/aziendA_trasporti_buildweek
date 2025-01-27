package org.example.gestioneBiglietti.DAO;

import javax.persistence.EntityManager;

public class TitoloDiViaggioDAO {
    private EntityManager em;

    public TitoloDiViaggioDAO(EntityManager em) {
        this.em = em;
    }
}
