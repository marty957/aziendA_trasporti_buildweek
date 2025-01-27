package org.example;


import com.github.javafaker.Faker;
import org.example.gestioneBiglietti.DAO.PuntoVenditaDAO;
import org.example.gestioneBiglietti.DAO.TesseraDAO;
import org.example.gestioneBiglietti.DAO.TitoloDiViaggioDAO;
import org.example.gestioneBiglietti.DAO.UtenteDAO;
import org.example.gestioneBiglietti.Enumerated.Periodicita;
import org.example.gestioneBiglietti.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main
{

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("trasporti");
    private static EntityManager em = emf.createEntityManager();


    public static void main( String[] args ) {

        PuntoVenditaDAO puntoVenditaDAO= new PuntoVenditaDAO(em);
        TitoloDiViaggioDAO titoloDiViaggioDAO=new TitoloDiViaggioDAO(em);
        UtenteDAO utenteDAO=new UtenteDAO(em);
        TesseraDAO tesseraDAO=new TesseraDAO(em);
        Faker faker = new Faker(new Locale("it"));

       //CREAZIONE DATI FAKE PUNTI VEMDITA
        PuntoVendita p1=new DistributoreAutomatico(faker.address().fullAddress(),true);
        PuntoVendita p2=new DistributoreAutomatico(faker.address().fullAddress(),true);
        PuntoVendita p3=new DistributoreAutomatico(faker.address().fullAddress(),true);
        PuntoVendita p4=new DistributoreAutomatico(faker.address().fullAddress(),false);
        PuntoVendita p5=new DistributoreAutomatico(faker.address().fullAddress(),false);
        PuntoVendita p6=new DistributoreAutomatico(faker.address().fullAddress(),true);

        PuntoVendita p7= new RivenditoreAutorizzato(faker.address().fullAddress(),faker.name().lastName());
        PuntoVendita p8= new RivenditoreAutorizzato(faker.address().fullAddress(),faker.name().lastName());
        PuntoVendita p9= new RivenditoreAutorizzato(faker.address().fullAddress(),faker.name().lastName());
        PuntoVendita p10= new RivenditoreAutorizzato(faker.address().fullAddress(),faker.name().lastName());
        PuntoVendita p11= new RivenditoreAutorizzato(faker.address().fullAddress(),faker.name().lastName());
        PuntoVendita p12= new RivenditoreAutorizzato(faker.address().fullAddress(),faker.name().lastName());

        //SALVATAGGIO PUNTI VENDITA NEL DB

//        puntoVenditaDAO.save(p1);
//        puntoVenditaDAO.save(p2);
//        puntoVenditaDAO.save(p3);
//        puntoVenditaDAO.save(p4);
//        puntoVenditaDAO.save(p5);
//        puntoVenditaDAO.save(p6);
//        puntoVenditaDAO.save(p7);
//        puntoVenditaDAO.save(p8);
//        puntoVenditaDAO.save(p9);
//        puntoVenditaDAO.save(p10);
//        puntoVenditaDAO.save(p11);
//        puntoVenditaDAO.save(p12);

       //CREAZIONE TESSERE ED UTENTI

        Tessera te1=new Tessera(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2024,9,4));
        Tessera te2=new Tessera(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2025,1,20));
        Tessera te3=new Tessera(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2024,2,2));
        Tessera te4=new Tessera(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2024,3,9));
        Tessera te5=new Tessera(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2024,1,28));

        Utente u1=new Utente();
        Utente u2=new Utente();
        Utente u3=new Utente();
        Utente u4=new Utente();

      // salavataggio utenti e tessere
//        tesseraDAO.save(te1);
//        tesseraDAO.save(te2);
//        tesseraDAO.save(te3);
//        tesseraDAO.save(te4);
//        tesseraDAO.save(te5);
//
//        utenteDAO.save(u1);
//        utenteDAO.save(u2);
//        utenteDAO.save(u3);
//        utenteDAO.save(u4);

      // creazione biglietti e abbonamenti

        TitoloDiViaggio t1=new Biglietto("A001",LocalDate.of(2024,12,27),p1,true);
        TitoloDiViaggio t2=new Biglietto("A002",LocalDate.of(2025,1,20),p1,true);
        TitoloDiViaggio t3=new Biglietto("A003",LocalDate.of(2025,1,22),p1,true);
        TitoloDiViaggio t4=new Biglietto("A004",LocalDate.of(2025,1,27),p1,false);

        TitoloDiViaggio t5=new Abbonamento("AB001",LocalDate.of(2025,1,27),p2,LocalDate.of(2025,2,27),te1,Periodicita.MENSILE);
        TitoloDiViaggio t6=new Abbonamento("AB002",LocalDate.of(2025,1,10),p2,LocalDate.of(2025,2,10),te2,Periodicita.MENSILE);
        TitoloDiViaggio t7=new Abbonamento("AB003",LocalDate.of(2024,12,1),p2,LocalDate.of(2025,1,1),te3,Periodicita.MENSILE);
        TitoloDiViaggio t8=new Abbonamento("AB004",LocalDate.of(2025,1,10),p2,LocalDate.of(2025,1,17),te4,Periodicita.SETTIMANALE);
        TitoloDiViaggio t9=new Abbonamento("AB005",LocalDate.of(2025,1,27),p2,LocalDate.of(2025,2,4),te2,Periodicita.SETTIMANALE);
        TitoloDiViaggio t10=new Abbonamento("AB006",LocalDate.of(2025,1,25),p2,LocalDate.of(2025,2,1),te5,Periodicita.SETTIMANALE);

        //array totale del venduto

        List<TitoloDiViaggio> totVenduto=new ArrayList<TitoloDiViaggio>();
        totVenduto.addAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10));

     //salvataggio
//        titoloDiViaggioDAO.save(t1);
//        titoloDiViaggioDAO.save(t2);
//        titoloDiViaggioDAO.save(t3);
//        titoloDiViaggioDAO.save(t4);
//        titoloDiViaggioDAO.save(t5);
//        titoloDiViaggioDAO.save(t6);
//        titoloDiViaggioDAO.save(t7);
//        titoloDiViaggioDAO.save(t8);
//        titoloDiViaggioDAO.save(t9);
//        titoloDiViaggioDAO.save(t10);

        p1.getListaVendita().addAll(Arrays.asList(t1,t5));
        p2.getListaVendita().addAll(Arrays.asList(t2,t6));
        p5.getListaVendita().addAll(Arrays.asList(t3,t7));
        p8.getListaVendita().addAll(Arrays.asList(t4));

        System.out.println(p2.bigliettiEmessi(LocalDate.of(2025,1,1),LocalDate.of(2025,1,29)));
        System.out.println(p8.bigliettiEmessi(LocalDate.of(2025,1,1),LocalDate.of(2025,1,29)));

    }
}
