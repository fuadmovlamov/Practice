package day18_practice;
//char a=97;
//        char z=122;
//        char A=65;
//        char Z = 90;
//        for (int i = a; i <=122; i++) {
//            System.out.println(a);
//            a++;
public class SmallTasks {
    public static void main(String[] args) {
        char a=97;
        char z=122;
        char A=65;
        char Z = 90;
        for (int i = Z; i >= A; i--) {
            System.out.println(Z);
            Z--;
        }

        System.out.println("************************");
        for (int i = A; i < Z; i++) {
            System.out.println(A);
            A++;

        }

        }

}