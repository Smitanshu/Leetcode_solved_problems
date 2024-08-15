class Solution {
    public int peakIndexInMountainArray(int[] arr) {

           int ans=0;
        for(int i=1; i<arr.length;i++){

            if(arr[i-1]>arr[i] && arr[i]<arr[i-1]){

                ans=i-1;
                break;
            }
        }
        return ans;
    }
}