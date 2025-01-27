package org.example.gestioneBiglietti.entities;

import javax.persistence.Entity;

@Entity
public class DistributoreAutomatico extends PuntoVendita {
     private boolean inFunzione;

     public DistributoreAutomatico() {
     }

     public DistributoreAutomatico(String indirizzo, boolean inFunzione) {
          super(indirizzo);
          this.inFunzione = inFunzione;
     }

     public boolean isInFunzione() {
          return inFunzione;
     }

     public void setInFunzione(boolean inFunzione) {
          this.inFunzione = inFunzione;
     }

     @Override
     public String toString() {
          return "DistributoreAutomatico{" +
                  "inFunzione=" + inFunzione +
                  "} " + super.toString();
     }
}

