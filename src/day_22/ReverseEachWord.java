package day_22;

import java.util.Arrays;

//String [] words = sentence.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        String reversed = "";
//
//        for (int i = words.length-1; i >= 0 ; i--) {
//            reversed += words[i] + " ";
//        }
//
//        System.out.println(reversed.trim());
public class ReverseEachWord {
    public static void main(String[] args) {
        String sen = "It started to snow in Chicago";
        String [] words = sen.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
