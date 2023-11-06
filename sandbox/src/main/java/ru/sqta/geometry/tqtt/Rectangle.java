package ru.sqta.geometry.tqtt;

public class Rectangle {
    public static void printRectangleAreaa(double a, double b) {
        System.out.println("Площадь квадрата со сторонами "  +  a + " и " + b +  " = " + RectangleAreaa(a, b));
    }

    private static double RectangleAreaa(double a, double b) {
        return a * b;
    }
}
