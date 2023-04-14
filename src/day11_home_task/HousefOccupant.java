package day11_home_task;

import java.util.Scanner;

//HouseOccupants
//
//    Create a class called HouseOccupants in your Practice_Programming project and inside the day12_tasks package
//
//        Task:
//     		Given a house type (String) print out the number of max occupants (int)
//
//        		Tree house: 1
//        		Mobile home: 2
//        		Apartment: 4
//        		Town house: 6
//        		Villa: 8
//        		Mansion: 10
//
//            	-> Try to use variables instead of printing multiple times
//
//		Hint: You can use switch
//
//
//        	Ex:
//        		Enter the type of the hose to see the max allowed occupants number.
//            		Town house
//
//            		OUTPUT:
//				There are 6 people in the Town house
public class HousefOccupant {


    public static void main(String[] args) {
        System.out.println("Enter the type of the hose to see the max allowed occupants number: ");
        //

        Scanner input = new Scanner(System.in);

        String typeOfHouse = input.next();
        switch (typeOfHouse) {
            case "Ana":
                System.out.println(" There are 1 people in the Town house");
        break;
            case "mobile Home":
                System.out.println(" There are 2 people in the Town house");
        break;
            case "Apartment":
                System.out.println("There are 4 people in the Town house");
                break;
            case "Town House":
                System.out.println("There are 6 people in the Town house");
                break;
            case "Villa":
                System.out.println("There are 8 people in the Town house");
                break;
            case "Mansion":
                System.out.println("There are 10 people in the Town house");
        }




    }
}
