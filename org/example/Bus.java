package org.example;

public class Bus extends Transport {
    private int speed = 70;
    private int cost = 3;

    public String buyTicket(Route route) {
        int length = route.getRouteLength();
        return route.getRoute() + ". Стоимость: " + cost * length + " рублей. Ехать приблизительно " + length / speed + "-" + (length / speed + 1) + " ч.";
    }
}
