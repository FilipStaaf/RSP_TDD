package com.example.rsp_tdd;

import java.util.Scanner;

public class GameLogic {

    public static String Sten = "Sten";
    public static String Påse = "Påse";
    public static String Sax = "Sax";


    public GameLogic(String player1, String player2){

        String computer = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hej Välkomen till Sten, Sax, Påse spelet! ");

        if(player2 == null){
            System.out.println("Spelare 1 valde: " + player1 + " Datorn valde: " + RandomGenerator(computer));
        }
    }

    public void Winner(String player1, String player2){
        if(player1 == "Sten"){

        }
    }


    public String RandomGenerator(String computer){
        int rand = (int)(Math.random()*3);
        if(rand == 0){
            return computer = "Sten";
        }if(rand == 1){
            return computer = "Påse";
        }else{
            return computer = "Sax";
        }
    }

}
