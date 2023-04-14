package day15;
//Ask user to enter two strings.
//
//    		Both strings should be at least 6 character long.
//        		If they are shorter than that
//            			print “Invalid data” and program should end.
//        		If the information provided is valid,
//            			you will take the first 4 characters of first string and combine them with the last three characters of the second string.
//
//        		At the end of your combined string
//            			add “@loopcamp.io” and print the final string as your created email.
//
//        		The final email should be in all lowercase.
//
//        		input: JamesBond Secret
//        		output: jameret@loopcamp.io
import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter your name: \n");
        String firstName = input.next();

        System.out.println("\nEnter your last name\n");
        String lastName = input.next();

        System.out.println("\nEnter your web \n");
        String email = input.next();


        if (firstName.length() <= 6 && lastName.length() <= 6) {
            System.out.println("Put minimum 6 character");

        } else if (firstName.length() >= 6 && lastName.length() >= 6) {
            System.out.println(firstName.substring(0, 4) + lastName.substring(lastName.length() - 3) + "@" + email + ".com");
        } else
            System.out.println("Invalid data");
    }
}
