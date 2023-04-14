package day_27;

import java.util.ArrayList;

//Create an ArrayList of Strings
//		add these elements:
//			add Hat
//			add Shoes
//			add Jacket in middle of Hat and Shoes
//			add Towel in the beginning
//			add Car between Towel and Hat
//
//		Print the ArrayList after each action to see how the change is made
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String>myList= new ArrayList<>();
        myList.add("hat");
        myList.add("shoes");
        myList.add(1, "jacket");
        myList.add(0,"towel");
        myList.add(1,"car");
        System.out.println(myList);
    }

}
