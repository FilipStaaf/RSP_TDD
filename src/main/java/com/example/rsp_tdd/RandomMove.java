package com.example.rsp_tdd;

import java.util.Random;

public class RandomMove {
    Random rand = new Random();
    public String randomMove() {
        int rand = this.rand.nextInt(3);
        if (rand == 0) {
            return "Sten";
        }
        if (rand == 1) {
            return "Påse";
        } else {
            return "Sax";
        }
    }
}
