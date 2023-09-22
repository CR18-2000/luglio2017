/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author crist
 */
public class DueBandeOr extends Bandiera{
    Rectangle r1;
    Rectangle r2;
    
    DueBandeOr(Color a, Color b) {
        super();
        r1= new Rectangle (0, 0, 60, 15);
        r1.setFill(a);
        this.getChildren().add(r1);
        r2 = new Rectangle (0, 15, 60, 15);
        r2.setFill(b);
        this.getChildren().add(r2);
    }
}
