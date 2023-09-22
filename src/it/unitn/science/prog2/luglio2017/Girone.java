/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * la classe contiene quattro squadre che si scontrano e si ha la classfica nel girone
 * @author crist
 */
public class Girone {
    
    Squadra a;
    Squadra b;
    Squadra c;
    Squadra d;
    Classifica classifica;
    Giornata primaGiornata;
    Giornata secondaGiornata;
    Giornata terzaGiornata;
    
    /**
     * viene aggiunta la classifica con le quattro squadre e le partite per ogni giornata
     * @param a prima squadra del girone
     * @param b seconda squadra del girone
     * @param c terza squadra del girone
     * @param d quarta squadra del girone
     */
    
    Girone(Squadra a, Squadra b, Squadra c, Squadra d) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        classifica = new Classifica (a, b, c, d);
        primaGiornata = new Giornata(new Partita(a, b, classifica), new Partita(c, d, classifica));
        secondaGiornata = new Giornata (new Partita(a, c, classifica), new Partita(b, d, classifica));
        terzaGiornata = new Giornata (new Partita(a, d, classifica), new Partita(b, c, classifica));
    }
    
    /**
     * mette in una VBox le varie partite delle giornate e alla fine la classifica
     * per ogni girone
     * @return 
     */
    
    public VBox stampare () {
        VBox tot = new VBox();
        Text t1 = new Text("===giornata 1===");
        VBox giornate = new VBox ();
        giornate = primaGiornata.stampare();
        tot.getChildren().add(t1);
        tot.getChildren().add(giornate);
        t1 = new Text("===giornata 2===");
        giornate = new VBox();
        giornate = secondaGiornata.stampare();
        tot.getChildren().add(t1);
        tot.getChildren().add(giornate);
        t1 = new Text("===giornata 3===");
        giornate = new VBox();
        giornate = terzaGiornata.stampare();
        tot.getChildren().add(t1);
        tot.getChildren().add(giornate);
        giornate = new VBox();
        t1 = new Text ("===CLASSIFICA===");
        tot.getChildren().add(t1);
        classifica.ordinare();
        giornate = classifica.stampare();
        tot.getChildren().add(giornate);
        return tot;
    }
    
    /**
     * i tre metodi mi permettono di far giocare la prima, la seconda e la terza 
     * giornata del girone
     */
    
    public void primoGioco () {
        primaGiornata.gioco();
    }
    
    public void secondoGioco () {
        secondaGiornata.gioco();
    }
    
    public void terzoGioco () {
        terzaGiornata.gioco();
    }
   
}
