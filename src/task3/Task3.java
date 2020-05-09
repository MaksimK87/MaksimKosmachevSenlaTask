package task3;

/*3.	Создать программу, которая будет:
-	подсчитывать количество слов в предложении
-	выводить их в отсортированном виде
-	делать первую букву каждого слова заглавной.
    Предложение вводится вручную. (Разделитель пробел (“ ”)).
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        String sentence;
        String resultSentence="";
        int wordQuantity;
        String[] splittedSent;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence: ");

        sentence = scanner.nextLine();

        System.out.println("Your sentence: " + sentence);

        splittedSent = sentence.trim().split(" ");

        Arrays.sort(splittedSent);

        wordQuantity = splittedSent.length;


        for (int i=0; i<splittedSent.length; i++){

            String firstLetter=splittedSent[i].substring(0,1).toUpperCase();
            String word=firstLetter.concat(splittedSent[i].substring(1));
            resultSentence=resultSentence.concat(word +" ");

        }

        System.out.println("Words quantity: " + wordQuantity);
        System.out.println("Result sentence: " +resultSentence);

    }

}




