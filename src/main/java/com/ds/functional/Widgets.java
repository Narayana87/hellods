package com.ds.functional;

import java.util.Objects;

public class Widgets {

    private String color;
    private double weight;
    private String shape;

    public Widgets(String color, double weight, String shape) {
        this.color = color;
        this.weight = weight;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Widgets{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", shape='" + shape + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Widgets widgets = (Widgets) o;
        return Double.compare(weight, widgets.weight) == 0 && Objects.equals(color, widgets.color) && Objects.equals(shape, widgets.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, shape);
    }
}
