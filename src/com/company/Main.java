//Micro Assigment 6 - Random Animals
package com.company;

public class Main {

    public static void main(String[] args) {

        //opretter et nyt objekt af typen/klassen bræt
        Board board = new Board(4);
        board.init(); //kalder listen, som danner brættet
        board.placering();
        board.updaterBræt();
        board.flytDyr();
        board.visBræt(); // får brættet frem på skærmen





    }
}
