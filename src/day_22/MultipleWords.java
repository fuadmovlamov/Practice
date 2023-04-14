package day_22;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String names = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] names2 = names.split(", ");
        System.out.println(Arrays.toString(names2));
        String result = "";
        for (int i = 0; i < names2.length ; i++) {
            if (names2[i].contains(" ")){
                result+=names2[i]+"\n";
            }
        }
        System.out.println(result);

        }
    }

