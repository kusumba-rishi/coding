package patterns;

//Input Format: N = 3
//Result:
//        1 2 3
//        1 2
//        1
//
//Input Format: N = 6
//Result:
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
