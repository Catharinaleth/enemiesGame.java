package com.company;
import java.util.Random; // importer Random, så vi kan anvende funktioner fra java Random class

public class Board {

    int boardSize = 4; //størrelsen på spillebrættet, repræsenterer koordinater
    Field[] række1 = new Field[boardSize];
    Field[] række2 = new Field[boardSize];
    Field[] række3 = new Field[boardSize];
    Field[] række4 = new Field[boardSize];

    Enemie[] enemieListe;
    Obstacle[] obstacleListe;

    Board(int antal) {
        enemieListe = new Enemie[antal];
        for (int i = 0; i < enemieListe.length; i++) {
            enemieListe[i] = new Enemie();
        }
        obstacleListe = new Obstacle[antal];
        for (int i = 0; i < obstacleListe.length; i++) {
            obstacleListe[i] = new Obstacle();
        }
    } // Konstruktør

    void placering() {
        Random r = new Random();
        for (int i = 0; i < enemieListe.length; i++) {
            Enemie e = enemieListe[i];
            e.x = r.nextInt(boardSize);
            e.y = r.nextInt(boardSize);
        }
        Random d = new Random();
        for (int i = 0; i < obstacleListe.length; i++) {
            Obstacle o = obstacleListe[i];
            o.x = d.nextInt(boardSize);
            o.y = d.nextInt(boardSize);
        }

    } // placering af både enemies, obstacle og hero

    void init() {

        for (int i = 0; i < række1.length; i++) {
            Field f1 = new Field();
            f1.x = i;
            f1.y = 0;
            række1[i] = f1;

            Field f2 = new Field();
            f2.x = i;
            f2.y = 1;
            række2[i] = f2;

            Field f3 = new Field();
            f3.x = i;
            f3.y = 2;
            række3[i] = f3;

            Field f4 = new Field();
            f4.x = i;
            f4.y = 3;
            række4[i] = f4;
        }
    } // Placering af brættet

    void visBræt() { //indsæt if statements, hvis der er dyr på samme placering som brættet
        for (int x = 0; x < række1.length; x++) {
            System.out.print(række1[x].symbol + " ");
        }
        System.out.println();
        for (Field f : række2) {
            System.out.print(f.symbol + " ");
        }
        System.out.println();
        for (Field f : række3) {
            System.out.print(f.symbol + " ");
        }
        System.out.println();
        for (Field f : række4) {
            System.out.print(f.symbol + " ");
        }
    }

    void updaterBræt() {
        for (Enemie e : enemieListe) {//printer dyrelisten men skal printes i stedet for _, hvilket den ikke gør nu
            if (e.y == 0) {
                række1[e.x].symbol = e.symbol;

            } else if (e.y == 1) {
                række2[e.x].symbol = e.symbol;

            } else if (e.y == 2) {
                række3[e.x].symbol = e.symbol;

            } else if (e.y == 3) {
                række4[e.x].symbol = e.symbol;
            }
        }
        for (Obstacle o : obstacleListe) {//printer dyrelisten men skal printes i stedet for _, hvilket den ikke gør nu
            if (o.y == 0) {
                række1[o.x].symbol = o.symbol;

            } else if (o.y == 1) {
                række2[o.x].symbol = o.symbol;

            } else if (o.y == 2) {
                række3[o.x].symbol = o.symbol;

            } else if (o.y == 3) {
                række4[o.x].symbol = o.symbol;

            }
        }
    }

    void flytDyr() { //skal flytte sig rundt på brættet til det rammer


    }
}


