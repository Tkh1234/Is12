package Melnikov.HomeWork10;

public class Exercise2 {
    static final double PI = 3.14;

    double square(double radius) {
        double s1 = PI * radius * radius;
        return s1;
    }

    static double length(double radius2) {
        double l1 = 2 * PI * radius2;
        return l1;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + square(radius3));
        System.out.println("Длина окружности = " + length(radius3));
    }
}

class Exercise2Test {
    public static void main(String[] args) {
        Exercise2 e1 = new Exercise2();
        e1.square(16);
        Exercise2.length(8.2);
        e1.info(15);

    }
}