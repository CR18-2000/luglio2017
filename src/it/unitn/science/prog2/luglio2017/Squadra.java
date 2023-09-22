/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.text.Text;

/**
 * la classe contiene le informazioni di ogni squadra
 * @author crist
 */
public class Squadra {
    
    String nome;
    int punteggio;
    Bandiera bandiera;
    Text t;
    
    /**
     * 
     * @param s è il nome della squadra
     * @param flag è la bandiera che costruisco in base a come è, ma qui uso la classe astratta
     * perchè tutte lo sono
     */
    
    Squadra (String s, Bandiera flag) {
        nome=s;
        punteggio=0;
        bandiera = flag;
    }
    
    /**
     * stampa il punteggio e il nome della squadra per essere aggiunto in classifica
     * @return un text in cui sono contenute le informazioni della squadra
     */
    
    //forse potrei ritornare un pane con la bandiera da mettere nel VBox
    
    public Text stampare() {
        t = new Text (punteggio + "  " + nome);
        return t;
    }
    
    /**
     * serve per stampare il punteggio e il nome della squadra in console
     */
    
    public void update() {
        t.setText(punteggio + "  " + nome);
    }
    
    /**
     * 
     * @return la banidera della squadra
     */
    
    public Bandiera stampa (){
        return bandiera;
    }
}
