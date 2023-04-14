package day_24;

//		Create a method that will that accepts three numbers.
//                Check if the total of three numbers:
//                If they are equal to 180 print: "This is a triangle"
//                If they are equal to 360 print: "This is a circle"
//                Else print: "This is not angle"
public class MethodPractice4 {
    public static void number(int num, int num2, int num3){
if (num+num2+num3==180)
    System.out.println("This is triangle");
else if (num+num2+num3==360) {
    System.out.println("This is circle");
} else
    System.out.println("This not angle");
    }

    public static void main(String[] args) {
        number(100,40,40);
    }
}
