package day12;

import java.util.Scanner;

public class VnedingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to wending machine");
        System.out.println("Please, enter one of the following: \n\tDrinks\n\tsnacks\n\tGum");

        String selection = input.next();
        String message ="";

        switch (selection){
            case "Drinks":
                System.out.println("you chose drinks: \n\t1) water\n\t2) soda\n\t3)Juice");
int drinkNumber = input.nextInt();
if (drinkNumber==1){
    message ="You have selected water";
} else if (drinkNumber==2) {
    message = "You have selected soda";

} else if (drinkNumber==3) {
    message= "You have selected juice";

} else {
    message="invalid input";
}


        }


    }


}
