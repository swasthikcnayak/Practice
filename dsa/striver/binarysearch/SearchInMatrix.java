package Practice.dsa.striver.binarysearch;

public class SearchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length * matrix[0].length-1;

        while(i<=j){
            int mid = i + (j-i)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                j  = mid - 1;
            } else{
                i = mid  + 1;
            }
        }
        return false;
    }

    // variation of search in the matrix where the matrix is sorted column wise and row wise

    // the first element of the next row need not be the ascending of the previous row last element.

    public boolean searchMatrix2(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;

        while(i<matrix.length && j>=0){
            if(target==matrix[i][j]){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}