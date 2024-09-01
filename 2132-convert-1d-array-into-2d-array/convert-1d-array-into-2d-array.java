class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
          int index=0;

            int [][]nums=new int[m][n];
            int [][]nums2=new int[0][0];

       
     if(original.length>m*n ||original.length<m*n ){
        return nums2;
     }

        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
               
               nums[i][j]=original[index];
               index++;

            }
        }
        
        return nums;
    }
}