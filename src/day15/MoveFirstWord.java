package day15;

import java.util.Scanner;
//Task:
//                Given a sentence.
//                Display the sentence with the first word moved to the end of the sentence.
//                    Ex:
//                    Input: Java is a fun language
//                    Output: is a fun language Java
//
//                Hint: Use indexOf and substring
public class MoveFirstWord {
    public static void main(String[] args) {
        String sentences = "Galatasaray is the best team";
        int number = sentences.indexOf(" ");
        String word1 = sentences.substring(0,number);




    }
}
