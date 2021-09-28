package com.example.rsp_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    @BeforeEach
    void setUp() {
    }

   /* @Test
    void test_random() {
        GameLogic gameLogic = new GameLogic("", "");
        assertEquals("Sax", gameLogic.RandomGenerator("",2));
        assertEquals("Sten", gameLogic.RandomGenerator("",0));
        assertEquals("Påse", gameLogic.RandomGenerator("",1));
    }*/

    @Test
    void test_random(){
        GameLogic gameLogic = new GameLogic("Sten", "Paper");


    }
}