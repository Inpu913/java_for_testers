package ru.sqta.geometry.figures;

public class Rectengle {
  public   static void printRectangleArea(double a, double b) {
      var text = String.format("Площадь прямоугольника со сторонами   %f и %f = %f", a,b,rectanglArea(a,b));
        System.out.println(text);
    }


    private static double rectanglArea(double a, double b) {
        return a*b;
    }


}
