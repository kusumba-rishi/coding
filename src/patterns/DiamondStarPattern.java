package patterns;

//Input Format: N = 3
//Result:
//          *
//         ***
//        *****
//        *****
//         ***
//          *
//Input Format: N = 6
//Result:
//             *
//            ***
//           *****
//          *******
//         *********
//        ***********
//        ***********
//         *********
//          *******
//           *****
//            ***
//             *

public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 6;
        printFirstHalf(n);
        printSecondHalf(n);
    }

    private static void printFirstHalf(int n) {
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

    private static void printSecondHalf(int n) {
        for (int i = n; i > 0; i--) {
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
