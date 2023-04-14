package day11_home_task;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year please: ");
        int year = input.nextInt();

if (1346<=year&&year<=1353){
    System.out.println(year+" year is The Black Death");
} else if ( 1665<=year&&year<=1666) {
    System.out.println(year+" year is Great Plague of London");
    
} else if (1770<=year&&year<=1772) {
    System.out.println(year+" year is Russian plague");
    
} else if (1889<=year&&year<=1890){
            System.out.println(year + " year is Flu pandemic");
        } else if (1916==year) {
    System.out.println(year+" year is American polio epidemic");
    
} else if (1918<=year&&year<=1920) {
    System.out.println(year+" year is Spanish Flu");
} else if (2009<=year&&year<=2010) {
    System.out.println(year+" year is H1N1 Swine Flu pandemic");
} else if (2014<=year&&year<=2016) {
    System.out.println(year+" West African Ebola epidemic");
} else if ( 2020>=year&&year>=2022) {
    System.out.println(year+" COVID-19");
} else {
    System.out.println("No pandemic");
}

    }



}
