package day15;

import java.util.Scanner;

//Given a String, write a program to display the middle character of a string
//
//                a) If the length of the string is even there will be two middle characters.
//                b) If the length of the string is odd there will be one middle character.
//                    Ex:
//                        Input: elephant
//                        Output: The middle characters: ph
public class MiddleChar {
    public static void main(String[] args) {
        System.out.println("Please enter word");

        Scanner input= new Scanner(System.in);
        String word = input.next();

if (word.length()%2==0){
    System.out.println("your middle character " +word.substring(word.length()/2-1,word.length()/2+1));
} else {
    System.out.println(word.substring(word.length()/2,word.length()/2+1));

    System.out.println(word.charAt(word.length()/2)+1);
}














    }
}
