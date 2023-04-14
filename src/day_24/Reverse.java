package day_24;

public class Reverse {
    public static void main(String[] args) {
        String[] str2 = {"one", "two", "three", "four", "five"};

        for (String word : str2) {
            String reverse = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reverse=reverse+word.charAt(i);
            }
            System.out.println(reverse+"");
        }
    }
}