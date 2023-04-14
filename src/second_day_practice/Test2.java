package second_day_practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number\n");
        int num = input.nextInt();
        for (int i = 0; i < 5; i++) {
            num=i;
            i++;
            if (num%2==0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }


        }
    }
}
