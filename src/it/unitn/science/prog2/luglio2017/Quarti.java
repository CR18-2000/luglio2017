/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.science.prog2.regazzoni.luglio2017;

/**
 * quarti di finale che mi portano alla semifinale
 * @author crist
 */
public class Quarti {
    
    Girone g1; Girone g2; Girone g3; Girone g4;
    Squadra s11; Squadra s12;
    Squadra s21; Squadra s22;
    Squadra s31; Squadra s32;
    Squadra s41; Squadra s42;
    Squadra primaSemifinalista; Squadra secondaSemifinalista;
    Squadra terzaSemifinalista; Squadra quartaSemifinalista;
    
    /**
     * 
     * @param g1 primo girone
     * @param g2 secondo girone
     * @param g3 terzo girone
     * @param g4 quarto girone
     */
    
    Quarti(Girone g1, Girone g2, Girone g3, Girone g4) {
        this.g1=g1;
        this.g2=g2;
        this.g3=g3;
        this.g4=g4;
        s11=g1.classifica.clas.get(0);
        s12=g1.classifica.clas.get(1);
        s21=g2.classifica.clas.get(0);
        s22=g2.classifica.clas.get(1);
        s31=g3.classifica.clas.get(0);
        s32=g3.classifica.clas.get(1);
        s41=g4.classifica.clas.get(0);
        s42=g4.classifica.clas.get(1);
    }
    
    /**
     * fa giocare le quattro partite, mi stampa in console la partita e il risultato
     * @return la semifinale da giocare tra le quattro squadre passate
     */
    
    public Semifinale gioco() {
        Partita p1 = new Partita(s11, s22);
        p1.giocoDopoGironi();
        System.out.println(p1);
        primaSemifinalista=p1.squadraVincitrice();
        Partita p2 = new Partita(s12, s21);
        p2.giocoDopoGironi();
        System.out.println(p2);
        secondaSemifinalista=p2.squadraVincitrice();
        Partita p3 = new Partita(s31, s42);
        p3.giocoDopoGironi();
        System.out.println(p3);
        terzaSemifinalista=p3.squadraVincitrice();
        Partita p4 = new Partita(s41, s32);
        p4.giocoDopoGironi();
        System.out.println(p4);
        quartaSemifinalista=p4.squadraVincitrice();
        Partita semi1 = new Partita(primaSemifinalista, secondaSemifinalista);
        Partita semi2 = new Partita(terzaSemifinalista, quartaSemifinalista);
        Semifinale s = new Semifinale (semi1, semi2);
        return s;
    }
    
}
