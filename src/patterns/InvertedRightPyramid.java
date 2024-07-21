package patterns;

//Input Format: N = 3
//Result:
//        * * *
//        * *
//        *
//
//Input Format: N = 6
//Result:
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class InvertedRightPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
