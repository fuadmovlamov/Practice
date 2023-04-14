package day21;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Feyruz Shahverdiyev", "Ruslan Heybatov", "Javid Shahbazov"};
        String initials ="";
        for (int i = 0; i < names.length; i++) {
            initials+=""+names[i].charAt(0)+names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(initials);
        }



    }
}
/*
"" FS RH JS

FS
FSRH
FSRHJS


 */