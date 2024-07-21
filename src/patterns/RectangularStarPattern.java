package patterns;

//Example 1:
//Input: N = 3
//Output:
//        * * *
//        * * *
//        * * *
//
//
//Example 2:
//Input: N = 6
//Output:
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *

public class RectangularStarPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
