package task2;

import java.util.Scanner;

/*2.	Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
        и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
        Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
*/
public class Task2 {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        int nodNumb, nocNumb;
        int number1, number2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integer values : ");

        for (int i = 0; i < numbers.length; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Wrong value, enter integer only!");
            }
            numbers[i] = scanner.nextInt();
        }

        number1 = numbers[0];
        number2 = numbers[1];

        nodNumb = nod(number1, number2);
        nocNumb = noc(number1, number2, nodNumb);

        System.out.println("NOD for values: " + number1 + " and " + number2 + " --> " + nodNumb);

        System.out.println("NOC for values: " + number1 + " and " + number2 + " --> " + nocNumb);
    }

    static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    static int noc(int a, int b, int nod) {
        return (a * b) / nod;
    }
}
