package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();
        PLane plane = new PLane();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше местоположение: ");
        String currentPosition = scanner.next();
        System.out.print("Введите город, куда Вы едите: ");
        String target = scanner.next();
        Route route = new Route(currentPosition, target);

        System.out.println("Автомобиль: ");
        System.out.println(car.buyTicket(route));
        System.out.println();

        System.out.println("Автобус: ");
        System.out.println(bus.buyTicket(route));
        System.out.println();

        System.out.println("Поезд: ");
        System.out.println(train.buyTicket(route));
        System.out.println();

        System.out.println("Самолёт: ");
        System.out.println(plane.buyTicket(route));
        System.out.println();

        System.out.println("УДАЧНОГО ПУТИ!");
    }
}
