/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * classe che apre una seconda finestra che contiene i bottoni per poter procedere
 * nelle varie fasi dell'europeo
 * @author crist
 */
public class Comandi {
    
    Girone g1;
    Girone g2;
    Girone g3;
    Girone g4;
    Scene scene2;
    Stage stage2;
    Semifinale s;
    Finale f;
    
    /**
     * vengono visualizzati i bottoni e viene messo il rispettivo ascoltatore
     * vengono visualizzati in console i risultati dei quarti, della semifinale e della finale
     * @param a è il primo girone
     * @param b è il secondo girone
     * @param c è il terzo girone
     * @param d è il quarto girone
     */
    
    Comandi (Girone a, Girone b, Girone c, Girone d) {
        GridPane gp = new GridPane();
        g1=a;
        g2=b;
        g3=c; 
        g4=d;
        Button firstDay = new Button ("1a giornata");
        Button secondDay = new Button ("2a giornata");
        secondDay.setDisable(true);
        Button thirdDay = new Button ("3a giornata");
        thirdDay.setDisable(true);
        Button quarti = new Button ("Quarti");
        quarti.setDisable(true);
        Button semifinale = new Button ("Semifinale");
        semifinale.setDisable(true);
        Button finale = new Button ("Finale");
        finale.setDisable(true);
        EventHandler<ActionEvent> eventHandler1 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                g1.primoGioco();
                g2.primoGioco();
                g3.primoGioco();
                g4.primoGioco();
                secondDay.setDisable(false);
                firstDay.setDisable(true);
            }
        };
        firstDay.addEventHandler(ActionEvent.ACTION, eventHandler1);
        EventHandler<ActionEvent> eventHandler2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                g1.secondoGioco();
                g2.secondoGioco();
                g3.secondoGioco();
                g4.secondoGioco();
                thirdDay.setDisable(false);
                secondDay.setDisable(true);
            }
        };
        secondDay.addEventHandler(ActionEvent.ACTION, eventHandler2);
        EventHandler<ActionEvent> eventHandler3 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                g1.terzoGioco();
                g2.terzoGioco();
                g3.terzoGioco();
                g4.terzoGioco();
                quarti.setDisable(false);
                thirdDay.setDisable(true);
            }
        };
        thirdDay.addEventHandler(ActionEvent.ACTION, eventHandler3);
        EventHandler<ActionEvent> eventHandlerq = new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent t) {
                Quarti q = new Quarti (g1, g2, g3, g4);
                s=q.gioco();
                semifinale.setDisable(false);
                quarti.setDisable(true);
            }
        };
        quarti.addEventHandler(ActionEvent.ACTION, eventHandlerq);
        EventHandler<ActionEvent> eventHandlerS = new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent t) {
                f=s.gioco();
                finale.setDisable(false);
                semifinale.setDisable(true);
            }
        };
        semifinale.addEventHandler(ActionEvent.ACTION, eventHandlerS);
        EventHandler<ActionEvent> eventHandlerF = new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent t) {
                f.giocoDopoGironi();
                System.out.println("FINALE");
                System.out.println(f);
                f.stampaVincitore();
                finale.setDisable(true);
                System.exit(0);
            }
        };
        finale.addEventHandler(ActionEvent.ACTION, eventHandlerF);
        gp.add(firstDay, 0, 0);
        gp.add(secondDay, 0, 1);
        gp.add(thirdDay, 0, 2);
        gp.add(quarti, 1, 0);
        gp.add(semifinale, 1, 1);
        gp.add(finale, 1, 2);
        scene2 = new Scene(gp, 200, 200);
        stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.show();
    }
    
}
