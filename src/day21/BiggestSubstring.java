package day21;

public class BiggestSubstring {
    public static void main(String[] args) {
                     //0123456789
        String word = "aaabbbcccccddddee";  // aaa  bbb  ccccc dddd  ee
        String longest = "";
        String nonLongest = "";

        for (int i = 0; i < word.length()-1; i++) {

            nonLongest += word.charAt(i); //0

            if ( word.charAt(i) == word.charAt(i+1)) {
                continue;
            }

            if (longest.length() < nonLongest.length()) {
                longest = nonLongest;
            }
            nonLongest = "";
        }
        System.out.println(longest);
    }

}
