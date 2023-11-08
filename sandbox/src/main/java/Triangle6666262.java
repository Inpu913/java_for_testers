public class Triangle6666262 {
    public static void main(String[] args) {
        PrintperimeterTriangle(2,4,7);
        
       var p = perimetrTriangle(2,4,7)/2;
        System.out.println(p);

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