package day15;

import java.util.Locale;
import java.util.Scanner;

//Given three String variables of some text find and print the longest word that also contains 'a'
//        	Ex:
//          		"java"
//         		"mouse"
//          		"computer"
//          		Output: java
//      		Ex:
//        		"java"
//        		"mouse"
//         		"apples"
//          		Output: apples
//
//      		Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter first word");
        String word = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println("Enter last word");
        String word3 = input.next();
        word3=word3.toLowerCase(Locale.ROOT);
        word2=word2.toLowerCase();
        word=word.toLowerCase();

        if (word.contains("a") && word.length()>=word2.length()&&word.length()>=word3.length()){
            System.out.println("The longest word is "+word);
        } else if (word2.contains("a")&&word2.length()>=word.length()&&word2.length()>=word3.length()) {
            System.out.println("The longest word is "+word2);
        } else if (word3.contains("a")&&word3.length()>=word.length()&&word3.length()>=word2.length()) {
            System.out.println("The longest word is "+word3);
        }


    }
}
