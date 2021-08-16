public class ClearZeroIn2DArray {
    static void solve(int[][] matrix){
        int M = matrix.length;
        int N = matrix[0].length;
        int[] rowRecord = new int[M];
        int[] colRecord = new int[N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    rowRecord[i] = 1;
                    colRecord[j] = 1;
                }
            }
        }
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                if(rowRecord[i]==0 || colRecord[j]==0){
//                    matrix[i][j] = 0;
//                }
//            }
//        }
        for (int i = 0; i < rowRecord.length; i++) {
            if(rowRecord[i]==1){
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < colRecord.length; i++) {
            if(colRecord[i]==1){
                for (int j = 0; j < M; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
