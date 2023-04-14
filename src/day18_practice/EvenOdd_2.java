package day18_practice;

import java.util.Scanner;

public class EvenOdd_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        System.out.println("+++++++++++++++++");
        int num = input.nextInt();

        for (int i = 0; i < 20; i++) {
            num=i;
            i++;
            if (num % 2 == 0) {
                System.out.println(num + " number is even");
            } else{
                System.out.println(num+" odd number");
            }

        }

    }
}
