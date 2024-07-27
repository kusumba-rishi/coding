package patterns;

//Input Format: N = 3
//Result:
//        *
//        **
//        ***
//        **
//        *
//Input Format: N = 6
//Result:
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *****
//        ****
//        ***
//        **
//        *

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
