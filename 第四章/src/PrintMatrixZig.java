public class PrintMatrixZig {
    static void print(int[][] matrix){
        int r = 0, m = matrix.length;
        int c = 0, n = matrix.length;
        boolean l2r = true;
        while (r < m && c < n){
            if(l2r){
                System.out.println(matrix[r][c] + " ");
                if(r==0 && c <n-1){
                    l2r = false;
                    c++;
                }else if(r>0 && c== n-1){
                    l2r = false;
                    r++;
                }else {
                    r--;
                    c++;
                }
            }else {
                if(c==0 && r< m-1){
                    l2r= true;
                    r++;
                }else if(r==m-1){
                    l2r = true;
                    c++;
                }else {
                    r++; c--;
                }
            }
        }
    }
}
