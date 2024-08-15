class Solution {
    public int peakIndexInMountainArray(int[] arr) {

           int ans=0;
        for(int i=1; i<arr.length;i++){

            if((i+1)<arr.length &&  arr[i]>arr[i+1]){
             ans=i;
              return i;
            }
        }
        return ans;
    }
}