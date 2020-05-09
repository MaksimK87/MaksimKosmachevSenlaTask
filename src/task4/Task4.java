package task4;
/*4.	Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    static int wordQuantityInText;

    public static void main(String[] args) {
        String text;
        String word=null;

        Pattern pattern;
        Matcher matcher;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");

        text = scanner.nextLine();

        System.out.println("Enter word: ");

        word=scanner.nextLine();

        System.out.println("Your word: ["+word+"]\n"+"Your text: [ " + text+" ]");

        pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        matcher=pattern.matcher(text);

        while(matcher.find()){

            wordQuantityInText++;
        }

        System.out.println("Word quantity of ["+word+ "] in text:" +wordQuantityInText);
    }
}
