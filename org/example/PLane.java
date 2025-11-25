package org.example;

public class PLane extends Transport{
    private int speed = 600;
    private int cost = 12;

    public String buyTicket(Route route) {
        int length = route.getRouteLength();
        return route.getRoute() + ". Стоимость: " + cost * length + " рублей. Лететь приблизительно " + length / speed + "-" + (length / speed + 1) + " ч.";
    }
}
