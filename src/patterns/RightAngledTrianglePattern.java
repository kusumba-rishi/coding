package patterns;

//Input Format: N = 3
//Result:
//        *
//        * *
//        * * *
//
//Input Format: N = 6
//Result:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *

public class RightAngledTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
