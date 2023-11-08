package ru.sqta.geometry;

import ru.sqta.geometry.figures.Rectengle;
import ru.sqta.geometry.figures.Square;
import ru.sqta.geometry.figures.Triangle;

public class Geometry  {
    public static void main(String[] args) {
        Square.printSquareArea(7);
        Square.printSquareArea(5);
        Square.printSquareArea(6);

        Rectengle.printRectangleArea (3,5);
        Rectengle.printRectangleArea (4,6);
        Triangle.printPerimetrTriangle(4,5,6);
    }

}
