package day_23;

import java.util.Arrays;

// Create a class called BiggestDiagonal in your Practice_Programming project and inside the day23_tasks package
//
//        Task:
//		Given a 2D array with values:
//
//			{3, 5, 1}
//			{1, 6, 10}
//			{5, 21, 10}
//
//
//		Calculate and find the biggest diagonal
//
//			(3+6+10) = 19
//			(1+6+6) = 13
//
//			Output 3, 6, 10
public class BiggestDiagonal {
    public static void main(String[] args) {

       int [] [] all = {{3, 5, 1},
                       {1, 6, 10},
                       {5, 21, 10}};
        System.out.println(all[0][0]+all[1][1]+all[2][2]);
        System.out.println(all[1][0]+all[1][1]+all[1][1]);


    }
}
