package day_23;

public class AverageOfEach {
    public static void main(String[] args) {
int [][] num = {{3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}};

        for (int[]number : num){
            int sum =0;
            for (int i = 0; i < number.length; i++) {
                sum+=number[i];
            }
            System.out.println(sum/ number.length);
        }

    }
}
