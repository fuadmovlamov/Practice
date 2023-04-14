package day12;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day of number     \n");

        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Saunday");
            default:
                System.out.println("Eror");
        }
    }

}