import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class ReverseMiddle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 word centences ");
        String str= input.nextLine();

        //i love java
        //012345678910
        int firstSpace =str.indexOf("");
        int lastSpace = str.lastIndexOf ( " ");
        String reverse = " ";

        String  middle = str.substring(firstSpace+1, lastSpace);
        for (int i = middle.length()-1; i >=0 ; i--) {
            reverse += middle.charAt(i);
        }
        //i evol java
        //012345678910
        System.out.println(str.substring(0, firstSpace)+" "+reverse+" "+ str.substring( lastSpace+1));

    }
}
