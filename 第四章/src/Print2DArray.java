public class Print2DArray {
    static void print(int[][] matrix){
        int leftUpRow = 0, leftUpCol = 0, rightDownRow = matrix.length-1, rightDownCol = matrix[0].length -1;
        int r = leftUpRow, c = leftUpCol;
        while (leftUpRow <= rightDownRow && leftUpCol <= rightDownCol){
            while (c <= rightDownCol){
                System.out.println(matrix[leftUpRow][c++]);
            }
            c=rightDownCol;
            r++;
            while (r <= rightDownRow){
                System.out.println(matrix[r++][leftUpCol]);
            }
            r = rightDownRow;
            c--;
            while (c > leftUpCol){
                System.out.println(matrix[r][c--]);
            }
            c = leftUpCol;
            r--;
            while (c < rightDownCol){
                System.out.println(matrix[r][c++]);
            }
            leftUpRow++;
            leftUpCol++;
            rightDownCol--;
            rightDownRow--;
        }

    }
}
