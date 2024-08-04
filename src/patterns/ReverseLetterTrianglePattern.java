package patterns;

//Input Format: N = 3
//Result:
//A B C
//A B
//A
//
//Input Format: N = 6
//Result:
//A B C D E F
//A B C D E
//A B C D
//A B C
//A B
//A


public class ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
