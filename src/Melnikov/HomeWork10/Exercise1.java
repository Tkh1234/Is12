package Melnikov.HomeWork10;

public class Exercise1 {
    static double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    static void division(int a, int b) {
        System.out.println("Целое частное = " + a / b + " Остаток = " + a % b);
    }
}

class Exercise1Test {
    public static void main(String[] args) {
        System.out.println(Exercise1.multiplication(23, 12, 54));
        System.out.println(Exercise1.multiplication(14, 45, 21));
        Exercise1.division(76, 11);
        Exercise1.division(86, 28);
    }
}