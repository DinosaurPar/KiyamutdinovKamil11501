package org.example;

import java.util.Random;

public class Bee{
    int x;
    int y;

    public Bee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void step() {
        Random random = new Random();
        int r = random.nextInt(4);
        if (r == 0) {
            if (x > 1) {
                x -= 2;
            }
        }
        if (r == 1) {
            if (y < 997) {
                y += 3;
            }
        }
        if (r == 2) {
            if (x < 998) {
                x += 2;
            }
        }
        if (r == 3) {
            if (y != 0) {
                y -= 1;
            }
        }
    }

    public int check() {
        if (40 < x & x < 60 & 40 < y & y < 60) {
            return 1;
        }
        return 0;
    }

    public String get_speice() {
        return "Bee";
    }
}
