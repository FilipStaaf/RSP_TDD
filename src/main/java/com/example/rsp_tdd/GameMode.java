package com.example.rsp_tdd;

import java.util.Scanner;

public class GameMode {
    Scanner scan = new Scanner(System.in);
    public void GameMode() {

        boolean whileChecker = false;

        while (!whileChecker) {

            System.out.println("Spela mot datorn tryck 1, spela mot annan spelare tryck 2");
            int numberSelected = scan.nextInt();
            GameModeChoice(whileChecker, numberSelected);

        }
    }

    public boolean GameModeChoice(boolean whileChecker, int numberSelected) {
        switch (numberSelected) {
            case 1 -> {
                PvE pve = new PvE();
                whileChecker = true;

            }
            case 2 -> {
                PvP pvp = new PvP();
                whileChecker = true;

            }
            default -> System.out.println("Ogiltligt val");
        }
        return whileChecker;
    }

    public GameLogic createComputerGame(String userName) {

        return null;
    }
}
