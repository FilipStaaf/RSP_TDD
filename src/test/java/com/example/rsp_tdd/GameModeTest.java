package com.example.rsp_tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GameModeTest {
    GameMode gameMode = new GameMode();

    @Test
    void test_game_mode_check() {

        assertEquals(true, gameMode.GameModeChoice(true, 1));
        assertEquals(true, gameMode.GameModeChoice(true, 2));

        // GameLogic gameLogic = gameMode.createComputerGame("Arne");

    }
 /*
    @Test
    void name() {
        GameLogic gameLogic = new GameLogic();
        gameLogic.move("sten");
    }

  */
}
