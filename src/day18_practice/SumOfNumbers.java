package day18_practice;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result=0;

        for (int i = 0 ; i<5 ; i++){
            System.out.println("Enter number: ");
            int number = s.nextInt();
            if (number<0){
                break;
            }
            result+=number;

        }System.out.println("Your total is: " + result);
    }
}
