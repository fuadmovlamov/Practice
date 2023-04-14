package day_24;

public class MethodPractice5 {
    public static void myWord (String word2 ){
        for (int i = 0; i < word2.length(); i++) {

            System.out.println(word2.charAt(i));
        }

    }

    public static void main(String[] args) {
        String word2 = "Fuad";
        myWord(word2);
    }
}
