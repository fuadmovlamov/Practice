package day12;

import java.util.Scanner;
import java.util.SortedMap;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double numbOne = input.nextDouble();
        System.out.println("Select operator:\n\t+\n\t-\n\t*\n\t?\n\t%\n\t Enter");
        String operator = input.next();
        System.out.println("Enter 2nd number: ");
        double numbtwo = input.nextDouble();

        double result;

        switch (operator) {
            case "+":
                result = numbOne + numbtwo;
                break;
            case "-":
                if (numbOne > numbtwo) {
                    result = numbOne - numbtwo;
                } else {
                    result = numbtwo - numbtwo;
                    result = numbtwo - numbOne;
                }
                break;

            case "*":
                result = numbOne * numbtwo;
                break;
            case "/":
                if (numbtwo != 0) {
                    result = numbOne / numbtwo;
                } else {
                    System.out.println("Can not divide by 0");
                }
                break;
            case "%":
                if (numbtwo != 0) {
                    result = numbOne % numbtwo;

                } else {
                    System.out.println("Can not divide by 0");
                }
                break;
            default:
                System.out.println("operator is not valid for this calculator");



        }

        }



        }





















