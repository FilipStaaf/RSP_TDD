package com.example.rsp_tdd;

import java.util.Scanner;

public class PvE {

    Scanner scan = new Scanner(System.in);
    String player1;
    public PvE() {
        player1 = scan.nextLine();
        String player2 = null;
        System.out.println("Skriv Sten, Påse eller Sax ");
        if(player1.equals("Sten") || player1.equals("Påse") || player1.equals("Sax")){
            GameLogic gameLogic = new GameLogic(player1, player2);
        }else{
            System.out.println("Vi skrev att du skulle skriva in ditt val!");
        }
    }

}
