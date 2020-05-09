package task1;
/*1.	Создать программу, которая будет сообщать, является ли целое число, введенное пользователем,
чётным или нечётным, простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        boolean isNumberSimple = true;
        long digit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit more than 1: ");

        while (!scanner.hasNextLong()) {

            scanner.next();
            System.out.println("Wrong value, enter integer only!");
        }

        digit = scanner.nextLong();

        if (digit == 1) {
            System.out.println("Incorrect data! Value must be more than \"1\"");
            System.exit(0);
        }

        if (digit == 2) {
            System.out.println("Value: " + digit + " is simple and even ");
            System.exit(0);
        }

        for (int divisor = 2; divisor <= (long) Math.sqrt(digit); divisor++) {

            if (digit % divisor == 0) {
                isNumberSimple = false;
                break;
            }
        }
        if (!isNumberSimple) {

            System.out.println("Value: " + digit + " - is complex");

            if (digit % 2 == 0) {
                System.out.println(digit + " is even");
            } else {
                System.out.println(digit + " is odd");
            }
        } else {
            System.out.println("Value: " + digit + " is simple and odd "); // all simple numbers except of 2 are odd
        }

    }

}
