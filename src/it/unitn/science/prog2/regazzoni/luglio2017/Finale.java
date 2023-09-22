/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

/**
 *
 * @author crist
 */
public class Finale extends Partita {
    
    public Finale(Squadra a, Squadra b) {
        super(a, b);
    }
    
    public void stampaVincitore () {
        Squadra sq = this.squadraVincitrice();
        System.err.println(sq.nome + " ha vinto");
    }
    
}
