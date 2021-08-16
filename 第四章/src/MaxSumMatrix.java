import java.util.Arrays;

public class MaxSumMatrix {
    private static int maxSum(int[][] matrix){
        int beginRow = 0;
        final int M = matrix.length;
        final int N = matrix[0].length;

        int[] sums = new int[N];

        int max = 0;

        while (beginRow < M){
            for (int i = beginRow; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    sums[j] += matrix[i][j];
                }
            }
            int t = MaxSum.maxSum(sums);
            if(t > max){
                max = t;
            }
            Arrays.fill(sums, 0);
            beginRow++;
        }
        return max;
    }
}
