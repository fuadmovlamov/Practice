package day11_home_task;

import java.util.Arrays;

//1994.01.31
public class Reverse4 {
    public static void main(String[] args) {
//        String str = "1994.01.31";
//        String [] arr = str.split(".");
//       String arrNewFormat= arr[2]+"-"+arr[1]+"-"+arr[0];
//        System.out.print(arrNewFormat);
      String str = "Loopcamp!";
        for (int i = 0; i <=str.length() ; i+=2) {
            System.out.println(str.charAt(i));
        }
    }

}
