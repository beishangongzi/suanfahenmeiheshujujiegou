public class MaxSquare {
  static int[][][] rec;
  private static void generateHelpRec(int[][] A){
      int N = A.length;
      rec = new int[N][N][2];
      int row = N-1;
      for (int i = N-1; i >= 0 ; i--) {
          int value = A[row][i];
          if(value == 1){
              if(i == N-1){
                  rec[row][i][0] = 1;
              }else {
                  rec[row][i][0] = rec[row][i+1][0] + 1;
              }
              rec[row][i][1] = 1;
          }
      }
      row--;
      for (int i = row; i >= 0 ; i--) {
          for (int j = N-1; j >= 0; j--) {
              int value = A[i][j];
              if(value == 1){
                  if(j==N-1){
                      rec[i][j][0] = 1;
                  }else{
                      rec[i][j][0] = rec[i][j+1][0] + 1;
                  }
                  rec[i][j][1] = rec[i+1][j][1] + 1;
              }
          }
      }
  }

  static int solve(int[][] A){
      int N = A.length;
      int n = N;
      while (n > 0){
          for (int i = 0; i < N; i++) {
              if(i + n > N) break;
              for (int j = 0; j < N; j++) {
                  if(j + n > N) break;
                  if(check(i, j, n)){
                      return n;
              }

              }
          }
          n--;
      }
      return n;
  }

    private static boolean check(int i, int j, int n) {
        return rec[i][j][0] >= n && rec[i][j][1] >= n && rec[i][j + n - 1][1] >= n && rec[i + n - 1][j][0] >= n;
    }
}
