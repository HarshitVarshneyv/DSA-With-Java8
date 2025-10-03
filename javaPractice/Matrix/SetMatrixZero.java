package javaPractice.Matrix;

class Solution {
    private static final int Marker = Integer.MIN_VALUE; //This will also fail if test case contains Min_Value
    //previously we are taking -1 which fails when matrix also contains -1
    //[[-1],[2],[3]]...  
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }
        for(int i = 0;i<rows;i++){
            for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == Marker) {
                matrix[i][j] = 0;
            }
        }
    }
    }

    private void markRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = Marker;
            }
        }
    }

    private void markCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = Marker;
            }
        }
    }
}


class Solution2 {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}