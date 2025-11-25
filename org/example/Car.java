package org.example;

public class Car extends Transport{
    private int speed = 100;
    private int cost = 8;

    public String buyTicket(Route route) {
        int length = route.getRouteLength();
        return route.getRoute() + ". Стоимость: " + cost * length + " рублей. Ехать приблизительно " + length / speed + "-" + (length / speed + 1) + " ч.";
    }
}
