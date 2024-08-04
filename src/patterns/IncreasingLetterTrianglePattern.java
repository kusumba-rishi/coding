package patterns;

//Input Format: N = 3
//Result:
//A
//A B
//A B C
//
//Input Format: N = 6
//Result:
//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F

public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
