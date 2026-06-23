class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int nums[]=new int [rows*cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[index++] = matrix[i][j];
            }
        }
        int i=0, j = rows*cols-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else {
                i=mid+1;
            }
        }
        return false;
        
    }
}
