package day12;

import java.time.MonthDay;
import java.util.Scanner;

public class weekSchedulle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week \n");
        String dayOfweek = input.next();

        String message = "";

        switch (dayOfweek){
            case "Monday":
            case "monday":
            case "MONDAY":
            case "Friday:":
            case "friday":
            case "FRIDAY":
                message = "We do not have a class";
                break;


            case "Wednesday":
            case "Thursday":
                message = "We have Java class at 7pm";
                break;
            case "Saturday":
                message = "We have Java class at 9:30am";
                break;
            default:
                message = "Sunday is not valid";





        }

        System.out.println(message);






    }



}
