package day11_home_task;

import java.util.Scanner;

//Given some month number determine which season it is
//
//    		Winter: 12,1,2
//    		Spring: 3,4,5
//    		Summer: 6,7,8
//    		Fall:   9,10,11
//
//        	Ex:
//        		when month = 2;
//            		OUTPUT:
//                		"Winter"
//
//        		when month = 7;
//            		OUTPUT:
//                		"Summer"
public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of month: \n\t");
        int month = input.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                String result = "";
                if ( month==12){
                    result= "\nDecember";
                    System.out.println(result);
                } else if (month==1) {
                    result = "\nJanuary";
                    System.out.println("January");

                } else {
                    result = "\nFebruary";
                    System.out.println("February");
                }
                System.out.println(result+" is winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(month+" is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("is Fall");






        }

















    }







}
