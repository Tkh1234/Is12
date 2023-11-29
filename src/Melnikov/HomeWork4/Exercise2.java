package Melnikov.HomeWork4;

public class Exercise2 {
    public static void main(String[] args) {
        //3.3.1
        int x = 1;
        int y = 3;
        if (y > 0) y = x;


        //3.3.2
        int score = 95;
        int pay = 0;
        if (score > 90) pay = pay + 3;

        System.out.println(y);
        System.out.println(pay);

        //3.3.3
        int area;
        int PI = (int) 3.1415926;
        int radius = 9;
        if (radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area for the circle of " + " radius " + radius + " is " + area);
        }


    }
}
