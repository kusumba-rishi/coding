package patterns;

//Input Format: N = 3
//Result:
//        1
//        01
//        101
//
//Input Format: N = 6
//Result:
//        1
//        01
//        101
//        0101
//        10101
//        010101

public class BinaryNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int start;
            if (i % 2 == 0)
                start = 0;
            else
                start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

