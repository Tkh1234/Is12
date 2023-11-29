package Melnikov.HomeWork2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите секунды: ");
        long s = input.nextInt();
        long sec = s % 60;
        long min = (s / 60) % 60;
        long hours = (s / 60) / 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
