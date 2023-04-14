package day_28_tasks;

import java.util.ArrayList;

//Tasks 1 - TargetWord
//
//    Create a class called TargetWord in your Practice_Programming project and inside the day28_tasks package
//
//
//
//        Task:
//    		Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
//
//		Ex:
//			Input:
//				”java”, ”html”, “css”, “java”, “javascript”, “selenium
//				Target: java
//
//			Output:
//				2
public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String> target = new ArrayList<>();
        target.add("java");
        target.add("html");
        target.add("css");
        target.add("java");
        target.add("javascript");
        target.add("selenium");
        System.out.println(target);
        int num=0;
        for (String each:target) {
            if (each.equals("java")) {
                num++;
            }
        }
        System.out.println(num);


    }
}
