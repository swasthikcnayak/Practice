package Practice.dsa.striver.binarysearch;

public class PeakElementInMatrix {
    public int[] findPeakGrid(int[][] mat) {
        int i = 0;
        int j = mat[0].length-1;

        while(i<=j){
            int col = i + (j-i)/2;

            int row = getMaxRow(mat, col);
            int leftVal = col==0?-1: mat[row][col-1];
            int rightVal = col == mat[0].length-1? -1: mat[row][col+1];
        
            if(mat[row][col] > leftVal && mat[row][col] > rightVal){
                return new int[]{row, col};   
            }
            else if(leftVal > mat[row][col]){
                j = col - 1;
            }else{
                i = col + 1;
            }
        }
        return new int[]{-1,-1};
    }


    public int getMaxRow(int[][] mat, int col){
        int row = 0;
        for(int i=1;i<mat.length;i++){
            if(mat[i][col] > mat[row][col]){
                row = i;
            }
        }
        return row;
    }
}