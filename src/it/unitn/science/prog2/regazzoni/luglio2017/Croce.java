/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * classe per disegnare la bandiera con una croce 
 * @author crist
 */
public class Croce extends Bandiera {
    Rectangle r1;
    Rectangle r2;
    
    /**
     * il costruttore va a creare sul rettangolo il disegno della bandiera di questo tipo in 
     * base ai colori passati come parametro
     * @param sfondo è il colore da usare nello sfondo della bandiera
     * @param cr è il colore da usare per la croce
     */
    
    Croce (Color sfondo, Color cr) {
        super();
        r.setFill(sfondo);
        r1 = new Rectangle (0, 13, 60, 4);
        r1.setFill(cr);
        this.getChildren().add(r1);
        r2 = new Rectangle (13, 0, 4, 30);
        r2.setFill(cr);
        this.getChildren().add(r2);
    }
}
