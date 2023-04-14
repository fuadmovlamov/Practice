package day_24;
//
public class MethodPractice2 {
    //  Task:
    //        create a method that will accept an age and determine if the person is eligible to vote.
    //        18 years or older Person must be eligible to vote


    public static void age(int num){

        if (num>=18){
            System.out.println("it is aligible to vote");
        }else {
            System.out.println("it is not aligible to vote");

        }

    }

    public static void main(String[] args) {
        age(19);
    }
}

