/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import java.util.Random;
import javafx.scene.text.Text;

/**
 * nella partita ho due squadre e ogni squadra può segnare grazie a un random
 * da 0 a 2 gol. viene quindi aggiornata la classifica
 * @author crist
 */
public class Partita {

    Squadra a;
    Squadra b;
    int golSquadraa;
    int golSquadrab;
    Text t;
    Classifica cl;
    
    /**
     * setto i gol a 0
     * @param a prima squadra
     * @param b seconda squadra
     * @param c classifica da aggiornare in base a chi vince
     */

    Partita(Squadra a, Squadra b, Classifica c) {
        this.a = a;
        this.b = b;
        golSquadraa = 0;
        golSquadrab = 0;
        cl = c;
    }
    
    /**
     * costruttore alternativo da usare dai quarti in poi in quanto non mi serve 
     * la classfica
     * @param a prima squadra
     * @param b seconda squadra
     */

    Partita(Squadra a, Squadra b) {
        this.a = a;
        this.b = b;
        golSquadraa = 0;
        golSquadrab = 0;
    }
    
    /**
     * 
     * @return un text in cui c'è il nome delle due squadre
     */

    public Text stampare() {
        t = new Text(a.nome + " vs " + b.nome);
        return t;
    }
    
    /**
     * aggiorna il text di prima quando la partita viene giocata aggiungendo il risultato
     */

    public void update() {
        t.setText(a.nome + " vs " + b.nome + "       " + golSquadraa + ":" + golSquadrab);
    }
    
    /**
     * fa giocare le due partite e aggiorna i punteggi delle squadre e la classifica
     */

    public void gioco() {
        Random random = new Random();
        golSquadraa = random.nextInt(3);
        golSquadrab = random.nextInt(3);
        if (golSquadraa > golSquadrab) {
            a.punteggio = a.punteggio + 3;
        } else if (golSquadraa < golSquadrab) {
            b.punteggio = b.punteggio + 3;
        } else {
            a.punteggio = a.punteggio + 1;
            b.punteggio = b.punteggio + 1;
        }
        update();
        a.update();
        b.update();
        cl.update();
    }
    
    /**
     * 
     * @return la squadra che ha vinto la partita
     */

    public Squadra squadraVincitrice() {
        if (golSquadraa > golSquadrab) {
            return a;
        } else if (golSquadraa < golSquadrab) {
            return b;
        } else if (a.nome.compareTo(b.nome) > 0) {
            return b;
        } else {
            return a;
        }
    }
    
    /**
     * metodo da usare per il gioco dai quarti in quanto non deve aggiornare la classifica
     */
    
    public void giocoDopoGironi(){
        Random random = new Random();
        golSquadraa = random.nextInt(3);
        golSquadrab = random.nextInt(3);
    }
    
    @Override
    public String toString(){
        return (a.nome+" vs "+b.nome+"  "+golSquadraa+":"+golSquadrab);
    }

}
