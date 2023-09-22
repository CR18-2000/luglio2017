/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * ogni giornata per ogni girone ci sono due partite
 * @author crist
 */
public class Giornata {
    
    Partita uno;
    Partita due;
    
    /**
     * 
     * @param a la prima partita del girone in cui istanzio la giornata
     * @param b la seconda partita del girone in cui istanzio la giornata
     */
    
    Giornata (Partita a, Partita b) {
        uno=a;
        due=b;
    }
    
    /**
     * 
     * @return stampa un VBox con la stampa delle due partite con eventuali risultati 
     * se già giocate
     */
    
    public VBox stampare() {
        VBox vb = new VBox();
        Text t = new Text();
        t=uno.stampare();
        vb.getChildren().add(t);
        t=due.stampare();
        vb.getChildren().add(t);
        return vb;
    }
    
    /**
     * permtette di giocare le due partite
     */
    
    public void gioco () {
        uno.gioco();
        due.gioco();
    }
}
