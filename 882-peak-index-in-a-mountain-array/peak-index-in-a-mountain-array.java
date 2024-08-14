class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
int index=0;
        for(int i=0; i<arr.length;i++){

    
            if(arr[i]>arr[i+1] && i+1<arr.length)


            {index=i;
            break;
            }
        }


        return index;
    }


}