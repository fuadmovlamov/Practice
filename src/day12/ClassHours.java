package day12;

import java.util.Scanner;

//Given some Day(String) print out the office hours schedule for that day if there is office hours.
//        		Monday:
//            			Print: Mentor Hours
//        		Tuesday:
//			Friday:
//				Print: No Class
//			Wednesday:
//			Thursday:
//			Saturday:
//            			Print: Java Class
//        		Sunday:
//				Print: Soft skills
//        		Any other String:
//            			Print: Invalid day given
//
//
//			Note: You need think of the cases the user put wrong input
//
//
//        	Ex:
//        		Enter the day of the week:
//            		Wednesday
//
//            		OUTPUT:
//				Java Class
public class ClassHours {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the day of week:\n\t");
        String dayOfWeek= input.next();

        switch (dayOfWeek){
            case "monday":
            case "Monday":
            case "MONDAY":
                System.out.println("\n\t-Mentor hours");
                break;
            case "tuesday":
            case "Tuesday":
            case "TUESDAY":
            case "friday":
            case "Friday":
            case "FRIDAY":
                System.out.println("\n\t-Not class day. Enjoy the day");
                break;
            case "Wednesday":
            case "wednesday":
            case "WEDNESDAY":
            case "Thursday":
            case "thursday":
            case "Saturday":
                System.out.println("\n\tJAVA class day. Yehuuuu");
                break;
            case "sunday":
            case "Sunday":
            case "SUNDAY":
                System.out.println("\n\tSoftskill day");
                break;
        }







    }



}
