public class Syllables {


    public static void main(String[] args) {


    String word = "ja na var";
    int count = 0;

        for (int i = 0; i < word.length(); i++) {

        if (word.charAt(i) == 'j') {
            count++;
        }


    }

        System.out.println("The count of syllables: " + (count +1));

}
}
