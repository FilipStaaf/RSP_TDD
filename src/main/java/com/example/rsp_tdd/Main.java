package com.example.rsp_tdd;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        boolean whileChecker = false;

        while (!whileChecker) {

            System.out.println("Spela mot datorn tryck 1, spela mot annan spelare tryck 2");
            int numberSelected = scan.nextInt();
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

        }
    }
}
