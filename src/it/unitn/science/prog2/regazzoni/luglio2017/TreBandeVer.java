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
public class TreBandeVer extends Bandiera{
    Rectangle r1;
    Rectangle r2;
    Rectangle r3;
    
    TreBandeVer (Color a, Color b, Color c) {
        super();
        r1 = new Rectangle (0, 0, 20, 30);
        r1.setFill(a);
        this.getChildren().add(r1);
        r2 = new Rectangle (20, 0, 20, 30);
        r2.setFill(b);
        this.getChildren().add(r2);
        r3 = new Rectangle (40, 0, 20, 30);
        r3.setFill(c);
        this.getChildren().add(r3);
    }
}
