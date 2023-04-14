package day_22;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ConvertOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        char [] a = firstName.toCharArray();
        System.out.println(Arrays.toString(a));
        System.out.println("Your initial is "+ a[0]+a[a.length-1]);













//        firstName=firstName.toUpperCase(Locale.ROOT);
//
//        char [] a = firstName.toCharArray();
//        System.out.println(Arrays.toString(a));
//        System.out.println(""+a[0]+a[a.length-1]);
    }
}
