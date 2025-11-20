package org.example;

import java.util.Random;

public class GrassHopper{
    int x;
    int y;

    public GrassHopper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void step() {
        Random random = new Random();
        int r = random.nextInt(4);
        if (r == 0) {
            if (x > 0) {
                x -= 1;
            }
        }
        if (r == 1) {
            if (y < 998) {
                y += 2;
            }
        }
        if (r == 2) {
            if (x < 999) {
                x += 1;
            }
        }
    }

    public int check() {
        if (400 < x & x < 600 & 400 < y & y < 600) {
            return 1;
        }
        return 0;
    }

    public String get_speice() {
        return "GrassHopper";
    }
}
