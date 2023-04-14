package day_23;
//Ex:
//
//			{1, 2, 3}
//			{2, 5, 10}
//			{0, 3, 20}
//
//				x
//
//			{10, 4, 3}
//			{5, 2, 7}
//			{100, 20, 5}
//
//		Output:
//
//			{10, 6, 9}
//			{10, 10, 70}
//			{0, 60, 100}
public class MultiplyArray {
    public static void main(String[] args) {
        int [][] a = {{1, 2, 3},
                     {2, 5, 10},
			         {0, 3, 20}};

        int [][]b = {{10, 4, 3},
                    {5, 2, 7},
                    {100, 20, 5}};
        //int [][] all = {a,b};

        System.out.println(a[1][2]+","+a[0][1]*a[0][2]+","+a[0][2]*a[0][2]);
        System.out.println(a[1][2]+","+a[1][2]+","+b[0][0]*b[1][2]);
        System.out.println(a[1][2]-a[1][2]+","+b[0][2]*b[2][1]+","+b[0][0]*b[0][0]);



    }
}
