package com.example.rsp_tdd;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        GameMode gameMode = new GameMode();
        gameMode.GameMode();
    }
}
