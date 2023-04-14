package day18_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//System.out.println(1 + " * " + 0 + " = " +  (1*0));
//        System.out.println(1 + " * " + 1 + " = " +  (1*1));
//        System.out.println(1 + " * " + 2 + " = " +  (1*2));
//        System.out.println(1 + " * " + 3 + " = " +  (1*3));
//        System.out.println(1 + " * " + 4 + " = " +  (1*4));
//        System.out.println(1 + " * " + 5 + " = " +  (1*5));
//        System.out.println(1 + " * " + 6 + " = " +  (1*6));
//        // ...... up to 10
//        System.out.println("");
//
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(1 + " * " + i + " = " +  (1*i));
//        }
//
//        System.out.println();
//        for (int j = 1; j <= 10; j++) {
//
//            for (int i = 0; i <= 10; i++) {
//                System.out.println(j + " * " + i + " = " +  (j*i));
//            }
//            System.out.println();
//        }
public class MysticCreature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you want to store");
        int size = input.nextInt();
        String [] friendList = new String[size];

        for(int i = 0; i < friendList.length; i++){

            System.out.println("Enter the name of friend " + (i + 1) );
            friendList[i] = input.next();

        }

        System.out.println(Arrays.toString(friendList));


    }
    }
