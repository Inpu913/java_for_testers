public class Triangle {
    public static void main(String[] args) {
        PrintperimeterTriangle(2,4,7);
        PrintperimeterTriangle(3,4,7);
        PrintperimeterTriangle(2,5,7);
        ;
    }



    ;

    static void PrintperimeterTriangle(double side1, double side2, double side3) {
        System.out.println("Периметр треугольника со сторонами " + side1 + " , " + side2 + " , " + side3 + " = " + perimetrTriangle(side1, side2, side3));
    }

    private static double perimetrTriangle(double a, double b, double c) {
        return a + b + c;
    };
}