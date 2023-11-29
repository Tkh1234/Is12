package Melnikov.HomeWork8;

public class Exercise1 {
    int summa() {
        int summa0 = 0;
        System.out.println("Сумма всех чисел: " + summa0);
        return summa0;
    }

    int summa(int a) {
        int summa1 = a;
        System.out.println("Сумма всех чисел: " + summa1);
        return summa1;
    }

    int summa(int b, int c) {
        int summa2 = b + c;
        System.out.println("Сумма всех чисел: " + summa2);
        return summa2;
    }

    int summa(int d, int e, int f) {
        int summa3 = d + e + f;
        System.out.println("Сумма всех чисел: " + summa3);
        return summa3;
    }

    int summa(int g, int h, int i, int j) {
        int summa4 = g + h + i + j;
        System.out.println("Сумма всех чисел: " + summa4);
        return summa4;
    }
}

class Exercise1Test {
    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        e1.summa();
        e1.summa(8);
        e1.summa(56, 42);
        e1.summa(534, 432, 286);
        e1.summa(4255, 9672, 5699, 1655);
    }
}