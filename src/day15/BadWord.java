package day15;

import java.util.Locale;
import java.util.Scanner;

//Given a String variable with a message.
//    		You will check if the message contains any of these bad words: “idiot, dumb, heck”
//
//        		If the message contains any of those words print: “Message not sent”.
//        		If the message is bad word free print “Message sent”
public class BadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nHello! How can i help you? \n");
        String words= input.nextLine();
        words=words.toLowerCase(Locale.ROOT);


        if (words.contains("idiot")||words.contains("dumb")||words.contains("hech")){

            System.out.println("Message not sent");
        } else {
            System.out.println("message sent");
        }



    }




}
