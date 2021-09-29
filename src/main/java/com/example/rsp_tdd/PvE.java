package com.example.rsp_tdd;

import java.util.Scanner;

public class PvE {
    RandomMove ran = new RandomMove();
    Scanner scan = new Scanner(System.in);
    String player1;
    public PvE() {

        String player2 = "";
        System.out.println("Skriv Sten, Påse eller Sax ");
        player1 = scan.nextLine();
        if(player1.equals("Sten") || player1.equals("Påse") || player1.equals("Sax")){
            GameLogic gameLogic = new GameLogic(ran ,player1, player2);
        }else{
            System.out.println("Vi skrev att du skulle skriva in ditt val!");
        }
    }
}
