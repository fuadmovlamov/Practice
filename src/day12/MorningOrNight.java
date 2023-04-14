package day12;

import java.util.Scanner;

//Task:
//    		Given some time value (int) in 24 hours format.
//    		Print if it's the morning or night.
//        		0 -11 : Morning
//        		12-24 : Night
//
//        		-> You can assume the value given is always valid (in the 24 hours range), but if you want a challenge use an if to control invalid values
//
//            		-> Try to use variables instead of printing multiple times
//
//			Hint: You can use ternary if you can. If not, you if else or what you think is easier for you.
//
//
//        	Ex:
//        		Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time:
//            		9
//
//            		OUTPUT:
//				Morning
public class MorningOrNight {

    public static void main(String[] args) {
        System.out.println("\n\tEnter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time:");
        Scanner input= new Scanner(System.in);

        int number= input.nextInt();
        if (number>=0&&number<=11){
            System.out.println("Morning");
        } else if (number>=12&&number<=24){
            System.out.println("Night");
        } else{
            System.out.println("invalid number. put beetween 0-24");
        }


















    }
}
