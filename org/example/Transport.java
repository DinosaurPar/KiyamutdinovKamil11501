package org.example;

public class Transport {
    private int speed = 40;
    private int cost = 5;

    public String buyTicket(Route route) {
        int length = route.getRouteLength();
        return route.getRoute() + ". Стоимость: " + cost * length + " рублей. Ехать приблизительно " + length / speed + " ч.";
    }
}
