package org.example.gestioneBiglietti.DAO;

import javax.persistence.EntityManager;

public class PuntoVenditaDAO {
    private EntityManager em;

    public PuntoVenditaDAO(EntityManager em) {
        this.em = em;
    }
}
