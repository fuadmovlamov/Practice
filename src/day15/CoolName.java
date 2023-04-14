package day15;

import java.util.Locale;
import java.util.Scanner;

//Declare a variable name. You will check if it is a cool name.
//        		-If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
//        		-If the name ends with 'm' print "Almost cool"
//        		-Otherwise print “Sorry not a cool name”
public class CoolName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nPlease enter coolest name: ");
        String coolName= input.nextLine();

        coolName=coolName.toLowerCase(Locale.ROOT) ;



        if (coolName.startsWith("a")||coolName.startsWith("z")){
            System.out.println("Your name is cool");
        } else if (coolName.endsWith("m")) {
            System.out.println("Almost cool");
        }
        else
            System.out.println("Sorry not a cool name");


    }
}
