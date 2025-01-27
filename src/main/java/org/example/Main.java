package org.example;


import org.example.gestioneBiglietti.DAO.PuntoVenditaDAO;
import org.example.gestioneBiglietti.DAO.TitoloDiViaggioDAO;
import org.example.gestioneBiglietti.DAO.UtenteDAO;
import org.example.gestioneBiglietti.entities.PuntoVendita;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main
{

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("trasporti");
    private static EntityManager em = emf.createEntityManager();


    public static void main( String[] args ) {

        PuntoVenditaDAO puntoVenditaDAO= new PuntoVenditaDAO(em);
        TitoloDiViaggioDAO titoloDiViaggioDAO=new TitoloDiViaggioDAO(em);
        UtenteDAO utenteDAO=new UtenteDAO(em);

    }
}
