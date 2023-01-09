import java.util.HashMap;
import java.util.Map;

public class Main {

    private static int[][] A = new int[][] {
        {100, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    private static int max = Integer.MIN_VALUE;

    private static void check(int row, int col, int acc) {
        try {
            acc += A[row][col];
            if (acc > max) max = acc;
            for (int k = -1; k <= 1; k++) {
                check(row + k,col + 1, acc);
            }
        }
        catch (IndexOutOfBoundsException e) {}
    }

    public static void main(String[] args) {
        for (int j = 0; j < A.length; j++) {
            check(j, 0, 0);
        }
        System.out.println(max);
    }

}
