package Practice.dsa.striver.arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        swapCol(matrix);
    }

    public void swapCol(int[][] mat){
        int left = 0;
        int right = mat[0].length-1;
        while(left<right){
            for(int i=0;i<mat.length;i++){
                swap(mat, left, right, i);
            }
            left++;
            right--;
        }
    }
    public void swap(int[][] mat,int left, int right, int row){
        int temp = mat[row][left];
        mat[row][left] = mat[row][right];
        mat[row][right] = temp;
    }

    public void transpose(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<=i;j++){
                swap(mat, i, j);
            }
        }
    }

    public void swap(int[][] mat,int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
