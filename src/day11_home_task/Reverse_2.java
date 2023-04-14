package day11_home_task;

//"one", "two", "three", "four", "five"
public class Reverse_2 {
    public static void main(String[] args) {
        String[] str = {"one", "two", "three", "four", "five"};
        for (String word : str) {
            String reverse =  word + " reverse version"+" ----"+" ";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(reverse);
        }


    }

}
