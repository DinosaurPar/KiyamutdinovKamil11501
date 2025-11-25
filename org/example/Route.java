package org.example;

import java.util.Arrays;

public class Route {
    public String[] city = {"Москва", "Волгоград", "Самара", "Петрозаводск"};
    public String depart;
    public String arrive;

    public Route(String depart, String arrive) {
        this.depart = depart;
        this.arrive = arrive;
    }

    public int getRouteLength() {
        String depart1 = depart;
        String arrive1 = arrive;
        int c = 2;
        while (c > 0) {
            if (Arrays.asList(city).contains(depart) && Arrays.asList(city).contains(arrive)) {
                if (depart1.equals("Москва") || arrive1.equals("Москва")) {
                    return 1000;
                }
                if (depart1.equals("Волгоград")){
                    if (arrive1.equals("Самара")) {return 850;}
                    if (arrive1.equals("Петрозаводск")) {return 1600;}
                }
                if (depart1.equals("Самара")) {return 2000;}
                }
            c -= 1;
            depart1 = arrive;
            arrive1 = depart;
        } return 0;
    }

    public String getRoute() {
        return "Маршрут: " + depart + " -- " + arrive;
    }
}
