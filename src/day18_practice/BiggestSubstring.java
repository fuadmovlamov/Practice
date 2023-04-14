package day18_practice;
// Biggest substring of matching characters
//
//                    // String s = "aaabbbcccccddddeeeeee";
//            String sub = ""; //
//            String biggest = ""; // ccccc
//            for(int i = 0; i < s.length() - 1; i++){
//                sub += s.charAt(i);
//                if(s.charAt(i) != s.charAt(i + 1)){  // when the character of i is different from the character next to it (i + 1)
//                    if(sub.length() > biggest.length()){
//                        biggest = sub; // assigns the substring as the new biggest
//                    }
//                    sub = ""; // resets this String for the next substring
//                }
//            }
//            System.out.println(biggest);
//        }
//}
public class BiggestSubstring {
    public static void main(String[] args) {
        String s = "bbbuuuueeedddddaaaaa";
        String sub = "";
            String biggest = "";
            for(int i = 0; i < s.length()-1; i++){
                sub += s.charAt(i);
                if(s.charAt(i) != s.charAt(i + 1)){  // when the character of i is different from the character next to it (i + 1)
                    if(sub.length() > biggest.length()){
                        biggest = sub; // assigns the substring as the new biggest
                    }
                    sub = ""; // resets this String for the next substring
                }
            }
            System.out.println(biggest);
        }
}
