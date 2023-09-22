/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author crist
 */
public class TreBandeOr extends Bandiera{
    Rectangle r1;
    Rectangle r2;
    Rectangle r3;
    
    public TreBandeOr(Color c1, Color c2, Color c3) {
        super();
        r1 = new Rectangle (0.0, 0.0, 60.0, 10.0);
        r1.setFill(c1);
        this.getChildren().add(r1);
        r2 = new Rectangle (0.0, 10.0, 60.0, 10.0);
        r2.setFill(c2);
        this.getChildren().add(r2);
        r3 = new Rectangle (0.0, 20.0, 60.0, 10.0);
        r3.setFill(c3);
        this.getChildren().add(r3);
    }
    
    
}
