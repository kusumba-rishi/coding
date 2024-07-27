package patterns;

//Input Format: N = 3
//Result:
//          *
//         ***
//        *****
//Input Format: N = 6
//Result:
//             *
//            ***
//           *****
//          *******
//         *********
//        ***********

public class StarPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
