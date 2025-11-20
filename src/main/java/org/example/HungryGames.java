package org.example;

public class HungryGames {
    public static String game() {
        Turtle turtle = new Turtle(10, 990);
        Bee bee = new Bee(0, 0);
        Ant ant = new Ant(300, 100);
        GrassHopper grassHopper = new GrassHopper(100, 100);

        while (true) {
            if (turtle.check() == 1) {
                return turtle.get_speice();
            } else turtle.step();
            if (bee.check() == 1) {
                return bee.get_speice();
            } else bee.step();
            if (ant.check() == 1) {
                return ant.get_speice();
            } else ant.step();
            if (grassHopper.check() == 1) {
                return grassHopper.get_speice();
            } else grassHopper.step();
        }
    }
}
