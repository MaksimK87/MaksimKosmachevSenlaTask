package task5;
/*5.	Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы
(зеркальное значение равно оригинальному). Длина последовательности N вводится вручную и не должна превышать 100. */

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {

        int n = 0;
        String reverseVal = "";
        String[] sequenseNumber;
        ArrayList<String> palindrome = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of sequence N <=100 : ");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 100) {
                    break;
                } else {
                    System.out.println("Value must be less or equal [100]!");
                    continue;
                }

            } else {
                scanner.next();
                System.out.println("Wrong value, try again!");
                continue;
            }
        }


        sequenseNumber = new String[n];

        for (int i = 0; i < sequenseNumber.length; i++) {
            System.out.println("Enter number: ");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sequenseNumber[i] = scanner.next();
                    break;
                }
                System.out.println("Wrong value, try again!");
            }
        }

        for (String number : sequenseNumber) {
            for (int i = number.length() - 1; i >= 0; i--) {
                reverseVal = reverseVal + number.charAt(i);
            }
            if (reverseVal.equals(number)) {
                palindrome.add(number);
            }
            reverseVal = "";
        }

        System.out.println("Palindrome from sequence: " + palindrome);

    }

}
