package com.example.rsp_tdd;

import java.util.Scanner;

public class GameLogic {
    RandomMove randomMove;
    public int rand;
    int player1points = 0;
    int player2points = 0;
    int rounds = 0;
    public GameLogic(RandomMove randomMove, String player1, String player2){

        Scanner scan = new Scanner(System.in);
        System.out.println("Hej Välkomen till Sten, Sax, Påse spelet! ");

        if(player2 == ""){
            player2 = randomMove.randomMove();
            System.out.println("Spelare 1 valde: " + player1 + " Datorn valde: " + player2 );
            Winner(player1,player2);
        }else{
            //Test strul
        }
    }

    public void Winner(String player1, String player2){
        if (player1.equals(player2)){
            System.out.println("Det blev lika!");
        }
        if(player1.equals("Sten") && player2.equals("Sax") ||
                player1.equals("Sax") && player2.equals("Påse") ||
                    player1.equals("Påse") && player2.equals("Sten")){
            System.out.println("Spelare1 vann denna rundan");
            player1points ++;

        }else{
            System.out.println("Spelare2 vann denna rundan");
            player2points++;
            winByThree(rounds, player1points, player2points);

        }
    }
    public String winByThree(int rounds, int player1points, int player2points){
        rounds ++;
        if(rounds == 3 && player1points > player2points ){
            return "spelare 1 vann";
        }else if(rounds == 3 && player1points < player2points ){
            return "spelare 2 vann";
        }
        return null;
    }
    /*
    public String RandomGenerator(String computer, int rand){
        rand = (int)(Math.random()*3);
        if(rand == 0){
            return computer = "Sten";
        }if(rand == 1){
            return computer = "Påse";
        }else{
            return computer = "Sax";
        }
    }

     */
}
