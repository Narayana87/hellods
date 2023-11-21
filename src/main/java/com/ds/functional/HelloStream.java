package com.ds.functional;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloStream {
    public static void main(String[] args) {
        Widgets w1 = new Widgets("RED", 15, "Rectangle");
        Widgets w2 = new Widgets("BLUE", 12, "Oval");
        Widgets w3 = new Widgets("WHITE", 16, "Circle");

        List<Widgets> widgetsList = new ArrayList<>();
        widgetsList.add(w1);
        widgetsList.add(w1);
        widgetsList.add(w1);


        System.out.println(widgetsList.stream().filter(w -> w.getColor() == "RED").toList());

        double totalRedSum = widgetsList.stream().filter(w -> w.getColor() == "RED").mapToDouble(widget -> widget.getWeight()).sum();
        System.out.println(totalRedSum);

    }
}
