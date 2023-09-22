/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.layout.Pane;
import static javafx.scene.paint.Color.BLACK;
import javafx.scene.shape.Rectangle;

/**
 * classe astratta che crea la bandiera legata a ciascuna squadra
 * è astratta per permettere di aggiunere la bandiera allo stato in base al tipo 
 * (che sia a tre bande orizzontali, verticali, due bande orizzontali o con la  croce)
 * @author crist
 */
public abstract class Bandiera extends Pane{
    
    /**
     *  @param r è la forma della bandiera su cui vado a costruire la bandiera vera e propria
     */
    Rectangle r;
    
    /**
     * bandiera ha solo il costruttore in quanto è metodo astratto
     */
    
    Bandiera() {
        this.setWidth(60);
        this.setHeight(30);
        r = new Rectangle (0, 0, 60, 30);
        r.setStroke(BLACK);
        this.getChildren().add(r);
    }
    
}
