package org.example;

public class Train extends Transport{
    private int speed = 90;
    private int cost = 6;

    public String buyTicket(Route route) {
        int length = route.getRouteLength();
        return route.getRoute() + ". Стоимость: " + cost * length + " рублей. Добираться приблизительно " + length / speed + "-" + (length / speed + 1) + " ч.";
    }
}
