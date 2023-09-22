/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.GREENYELLOW;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.WHITE;
import static javafx.scene.paint.Color.YELLOW;
import javafx.stage.Stage;

/**
 * classe che funge da main
 * @author crist
 */
public class Luglio2017 extends Application {
    
    Girone g1 = new Girone (new Squadra("Austria", new TreBandeOr(RED, WHITE, RED)), new Squadra("Italia", new TreBandeVer(RED, WHITE, GREEN)), new Squadra("Francia", new TreBandeVer(Color.RED, Color.WHITE, Color.BLUE)), new Squadra("Germania", new TreBandeOr(RED, YELLOW, BLACK)));
    Girone g2 = new Girone (new Squadra("Olanda", new TreBandeOr(RED, WHITE, BLUE)), new Squadra("Bulgaria", new TreBandeOr(WHITE, GREEN, RED)), new Squadra("Russia", new TreBandeOr(WHITE, RED, BLUE)), new Squadra("Spagna", new TreBandeOr(RED, YELLOW, RED)));
    Girone g3 = new Girone (new Squadra("Svezia", new Croce(BLUE, YELLOW)), new Squadra("Belgio", new TreBandeVer (RED, YELLOW, BLACK)), new Squadra("Ungheria", new TreBandeOr(RED, WHITE, GREEN)), new Squadra("Irlanda", new TreBandeVer(RED, WHITE, GREENYELLOW)));
    Girone g4 = new Girone (new Squadra("Finlandia", new Croce(WHITE, RED)), new Squadra("Danimarca", new Croce(RED, WHITE)), new Squadra("Polonia", new DueBandeOr(WHITE, RED)), new Squadra("Ucraina", new DueBandeOr(BLUE, YELLOW)));
    
    /**
     * il metodo start viene richiamato dal main e mi crea la finestra grafica
     * @param primaryStage 
     */
    
    @Override
    public void start(Stage primaryStage) {
        new Comandi (g1, g2, g3, g4);
        GridPane root = new GridPane();
        ColumnConstraints cc1 = new ColumnConstraints();
        cc1.setPercentWidth(100. / 2);
        RowConstraints rc1 = new RowConstraints();
        rc1.setPercentHeight(100. / 2);
        root.getColumnConstraints().addAll(cc1, cc1);
        root.getRowConstraints().addAll(rc1, rc1);
        VBox vb1 = new VBox ();
        vb1 = g1.stampare();
        root.add(vb1, 0, 0);
        VBox vb2 = new VBox ();
        vb2 = g2.stampare();
        root.add(vb2, 0, 1);
        VBox vb3 = new VBox ();
        vb3 = g3.stampare();
        root.add(vb3, 1, 0);
        VBox vb4 = new VBox ();
        vb4 = g4.stampare();
        root.add(vb4, 1, 1);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Euro 2016");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
