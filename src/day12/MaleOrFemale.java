package day12;

public class MaleOrFemale {


    public static void main(String[] args) {

        char letter = 'M';
        switch (letter) {

            case 'm':
            case 'M':
                System.out.println("Male restrooms");
                break;
            case 'w':
            case 'W':
                System.out.println("Women restrooms");
                break;
            default:
                System.out.println("invalid letter");

        }

    }
}
