package day15;

import java.util.Locale;
import java.util.Scanner;

//Task:
//    		A person will enter their address into a String. Make sure the String is not empty.
//        		If it is empty print: "No address found".
//        		If there is an address, make all the text uppercase to match the expected format
//
//            		Ex:
//                		Input: 231332 Leaf ave, lake city 3132
//                		Output: 231332 LEAF AVE, LAKE CITY 3132
//            		Ex:
//                		Input: ""
//                		Output: No address found
public class Address {
    public static void main(String[] args) {

        System.out.println("\n\nPlease enter your address: \n");
        Scanner input=new Scanner(System.in);
        String address = input.nextLine();

        if (address.isEmpty()){
            System.out.println("No address found");
        } else
            address=address.toUpperCase(Locale.ROOT);
        System.out.println(address);
        }


    }

