package Melnikov.HomeWork4;

public class Exercise4 {
    public static void main(String[] args) {
        //3.5.1
        int x = 3;
        int y = 2;
        int z;
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is " + z);
            }
        }
        else
            System.out.println("x is " + x);

        int x1 = 3;
        int y1 = 4;
        int z1;
        if (x1 > 2) {
            if (y1 > 2) {
                z1 = x1 + y1;
                System.out.println("z is " + z1);
            }
        }
        else
            System.out.println("x is " + x1);

        int x2 = 2;
        int y2 = 2;
        int z2;
        if (x2 > 2) {
            if (y2 > 2) {
                z2 = x2 + y2;
                System.out.println("z is " + z2);
            }
        }
        else
            System.out.println("x is " + x2);

        //3.5.2
        int x3 = 2;
        int y3 = 3;
        if (x3 > 2)
            if (y3 > 2) {
                int z3 = x3 + y3;
                System.out.println("z is " + z3);
            }
        else System.out.println("x is " + x3);

        int x4 = 3;
        int y4 = 2;
        if (x4 > 2)
            if (y4 > 2) {
                int z4 = x4 + y4;
                System.out.println("z is " + z4);
            }
            else
                System.out.println("x is " + x4);

        int x5 = 3;
        int y5 = 3;
        if (x5 > 2)
            if (y5 > 2) {
                int z5 = x5 + y5;
                System.out.println("z is " + z5);
            }
            else
                System.out.println("x is " + x5);

        //3.5.3
        int score = 76;
        if (score >= 60)
            System.out.println("D");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 90)
            System.out.println("A");
        else
            System.out.println("F");
        // Программа работает некоректно. Что бы она заработала нужно поменять местами баллы (A;B;C;D;F). От большего к меньшему
    }
}
