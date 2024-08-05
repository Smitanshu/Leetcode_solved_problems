class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

int n=arr.length;
        for(int i=0; i<n;i++){
            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}