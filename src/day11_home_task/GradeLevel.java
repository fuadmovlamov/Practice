package day11_home_task;

//GradeLevel
//
//    Create a class called GradeLevel in your Practice_Programming project and inside the day12_tasks package
//
//        Task:
//    		    Given a grade level (byte) determine and print which school level someone is in.
//
//        		1-5: Elementary school
//        		6-8: Middle school
//        		9-12: High school
//        		13-16: College
//        		17-18: Grad School
//        		Other: Invalid grade level given
//
//		Hint: You can use it else
//
//
//        	Ex:
//        		Enter a grade level to see which school level someone is in.
//            		18
//
//            		OUTPUT:
//                		Grad School
public class GradeLevel {

    public static void main(String[] args) {

        System.out.println("Which school level someone is in");
        String msg;

        byte level = 15;

        if (1<=level&&level<=5){
          msg ="Elementary school";
        } else if (6<=level&&level<=8) {
            msg="Middle school";
        } else if (9<=level&&level<=12){
          msg="High school";
        } else if (13<=level&&level<=16) {
            msg="College";
        } else if (17<=level&&level<=18) {
            msg="Grad School";
        } else {
            msg="Invalid grade level given";
        }
        System.out.println(msg);

    }




}
