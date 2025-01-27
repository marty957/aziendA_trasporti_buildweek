package org.example;


import org.example.gestioneBiglietti.DAO.PuntoVenditaDAO;
import org.example.gestioneBiglietti.DAO.TitoloDiViaggioDAO;
import org.example.gestioneBiglietti.DAO.UtenteDAO;
import org.example.gestioneBiglietti.Enumerated.Periodicita;
import org.example.gestioneBiglietti.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main
{

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("trasporti");
    private static EntityManager em = emf.createEntityManager();


    public static void main( String[] args ) {

        PuntoVenditaDAO puntoVenditaDAO= new PuntoVenditaDAO(em);
        TitoloDiViaggioDAO titoloDiViaggioDAO=new TitoloDiViaggioDAO(em);
        UtenteDAO utenteDAO=new UtenteDAO(em);

        PuntoVendita p1=new DistributoreAutomatico("Via roma",true);
        PuntoVendita P2= new RivenditoreAutorizzato("Via como 15","IL TABACCHINO GIGI");

       Tessera te1=new Tessera("mario","rossi", LocalDate.of(2025,1,10),LocalDate.of(2026,1,10));
        Utente u2=new Utente();

        TitoloDiViaggio t1=new Biglietto("AB123",LocalDate.of(2025,1,27),true);
        TitoloDiViaggio t2=new Abbonamento("ab125",LocalDate.now(),LocalDate.of(2025,2,27), Periodicita.MENSILE,te1);



    }
}
