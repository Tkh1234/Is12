package Melnikov;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("pi can be computed using the following formula:");
        System.out.println("pi = 4 * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)");
        System.out.println("Part 1");
        System.out.println("4 * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)=" + 4.0*(1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/9.0-1.0/11.0));
        System.out.println("Part 2");
        System.out.println("4 * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)=" + 4.0*(1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/9.0-1.0/11.0+1.0/13.0));
    }
}
