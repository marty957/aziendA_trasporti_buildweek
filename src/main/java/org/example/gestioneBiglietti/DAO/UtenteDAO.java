package org.example.gestioneBiglietti.DAO;

import javax.persistence.EntityManager;

public class UtenteDAO {
    private EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }
}
