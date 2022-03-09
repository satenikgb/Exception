package day22;

import java.util.Scanner;

public class task1 {
    public static int Number() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Try again");

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Number());

    }
}
