package day_23;
//Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines
//
//		Ex:
//
//			{"James", "is", "back"}
//			{"he", "was", "never", "gone"}
//			{"methods", "tomorrow"}
//
//		Output:
//			ssk
//			esre
//			sw
public class LastChars {
    public static void main(String[] args) {
        String [][] names = {{"James", "is", "back"},
                            {"he", "was", "never", "gone"},
                            {"methods", "tomorrow"}};
        System.out.print(names[0][0].charAt(names [0][0].length()-1));
        System.out.print(names[0][1].charAt(names[0][1].length()-1));
        System.out.println(names[0][2].charAt(names[0][2].length()-1));

        System.out.print(names[1][0].charAt(names[1][0].length()-1));
        System.out.print(names[1][1].charAt(names[1][1].length()-1));
        System.out.print(names[1][2].charAt(names[1][2].length()-1));
        System.out.println(names[1][3].charAt(names[1][3].length()-1));

        System.out.print(names[1][1].charAt(names[1][1].length()-1));
        System.out.print(names[2][1].charAt(names[2][1].length()-1));
    }
}
