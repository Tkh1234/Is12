package Melnikov.HomeWork4;

public class Exercise3 {
    public static void main(String[] args) {
        //3.4.1
        int score = 142;
        int pay = 87;
        if (score > 90)
            pay = pay + 3;
        else
            pay = pay + 1;

        System.out.println(pay);

        //3.4.2
        int number = 30;
        if (number % 2 == 0)
            System.out.println(number + "is even. ");
        System.out.println(number + "is odd");

        int number1 = 35;
        if (number1 % 2 == 0)
            System.out.println(number1 + "is even. ");
        System.out.println(number1 + "is odd");
    }
}
