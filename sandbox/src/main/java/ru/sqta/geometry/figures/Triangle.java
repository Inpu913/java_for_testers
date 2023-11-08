package ru.sqta.geometry.figures;

public class Triangle {



    public static  void printPerimetrTriangle (double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f и %f и  %f = %f ", a,b,c, perimetrTriangle(a,b,c));
        System.out.println(text);



    }


    private static Object perimetrTriangle(double a, double b, double c) {
        return (a+b+c);
    }



}
