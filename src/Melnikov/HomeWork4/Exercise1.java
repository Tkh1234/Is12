package Melnikov.HomeWork4;

public class Exercise1 {
    public static void main(String[] args) {
        //3.2.1
        // реляционные операторы: = равный к; > больше чем; < меньше чем; >= больше чем или равно; <= меньше чем или равно; <> не равно;
        //3.2.2
        int x = 1;

        boolean b1 = x > 0;
        boolean b2 = x < 0;
        boolean b3 = x != 0;
        boolean b4 = x >= 0;
        boolean b5 = x <= 0;

        //3.2.3
        // Нет. Так как перевод из int в boolean и наоборот запрещен в Java

        //boolean b= true;
        //i = (int)b;

        //int i = 1;
        //boolean b = (boolean)i;



        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


    }
}
