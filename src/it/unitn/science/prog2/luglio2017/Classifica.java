/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * classe che mi crea la classfica che mi serve sia per visualizzarla
 * che per sapere quali squadre passano i quarti
 * la classifica è solo per i gironi dei quarti
 * @author crist
 */
public class Classifica {
    
    ArrayList<Squadra> clas = new ArrayList<>();
    Text t;
    VBox vb;
    Pane p;
    
    /**
     * ogni girone è composto da quattro squadre 
     * @param a prima squadra del girone
     * @param b seconda squadra del girone
     * @param c terza squadra del girone
     * @param d quarta squadra del girone
     */
    
    Classifica(Squadra a, Squadra b, Squadra c, Squadra d) {
        clas.add(a); clas.add(b); clas.add(c); clas.add(d);
    }
    
    /**
     * metodo che mi riordina la classifica in base al punteggio.
     * in caso di partià di punteggio, il riordinamento procede con l'ordine alfabetico
     */
    
    public void ordinare () {
        Squadra app;
        for (int i=0; i<4; i++) {
            for (int j=i; j<4; j++) {
                if (clas.get(i).punteggio<clas.get(j).punteggio) {
                    app=clas.get(i);
                    clas.set(i, clas.get(j));
                    clas.set(j, app);
                } else if (clas.get(i).punteggio==clas.get(j).punteggio) {
                    if ((clas.get(i).nome).compareTo(clas.get(j).nome)>0) {
                        app=clas.get(i);
                        clas.set(i, clas.get(j));
                        clas.set(j, app);
                    }
                }
            }
        }
        
    }
    
    /**
     * metodo che mi stampa la classifica in un VBox
     * @return un VBox da unire alle partite per avere la stampa del girone
     */
    
    public VBox stampare() {
        ordinare();
        vb = new VBox();
        p = new Pane();
        t = new Text();
        for (Squadra n : clas) {
            t=n.stampare();
            vb.getChildren().add(t);
            p=n.stampa();
            vb.getChildren().add(p);
        }
        return vb;
    }
    
    /**
     * metodo che mi permette di aggiornare il VBox quando l'ordine ddella classfica 
     * può essere cambiato, ossia dopo ogni partita
     */
    
    public void update () {
        ordinare();
        vb.getChildren().clear();
        for (Squadra n : clas) {
            t=n.stampare();
            vb.getChildren().add(t);
            p=n.stampa();
            vb.getChildren().add(p);
        }
    }
    
}
