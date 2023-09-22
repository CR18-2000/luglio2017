/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

/**
 * semifinale disputata per arrivare in finale
 * @author crist
 */
public class Semifinale {
    
    Partita semi1;
    Partita semi2;
    
    /**
     * 
     * @param semi1 prima semifinale
     * @param semi2 seconda semifinale
     */

    Semifinale(Partita semi1, Partita semi2) {
        this.semi1=semi1;
        this.semi2=semi2;
    }
    
    /**
     * gioca le semifinali
     * @return la finale tra le vincitrici delle semifinali
     */
    
    public Finale gioco(){
        semi1.giocoDopoGironi();
        System.out.println("SEMIFINALE");
        System.out.println(semi1);
        Squadra a = semi1.squadraVincitrice();
        semi2.giocoDopoGironi();
        System.out.println(semi2);
        Squadra b = semi2.squadraVincitrice();
        Finale f = new Finale (a, b);
        return f;
    }
}
