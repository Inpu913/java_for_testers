package ru.sqta.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalucatedArea()
    {
        var result = Square.Area(5);
        Assertions.assertEquals(25.0, result);
    }
    @Test
    void canCalculatePerimeter()
    {
        Assertions.assertEquals(25, Square.perimeter(5.0));
    }
}
