package day11_home_task;

import java.util.ArrayList;

//"Galatasaray","Fenerbahche"
public class Reverse3 {
    public static void main(String[] args) {
String [] str = {"Galatasaray","Fenerbahche"};
        for (String word:str) {
            String reverse = " ";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverse+=word.charAt(i);

            }
            System.out.println(reverse);
        }

    }
}
