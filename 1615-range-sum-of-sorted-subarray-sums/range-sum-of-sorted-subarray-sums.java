class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        

        long []arr=new long[n * (n + 1) / 2 ];
      int index=0;
        for(int i=0;i<n;i++){
         long  sum=0;
            for(int j=i; j<n;j++){
                int bit=nums[j];
                sum=sum+bit;
                arr[index]=sum;
                index++;

            }
        }

        Arrays.sort(arr);
       
        long ans=0;
        for(int i=left-1;i<right;i++){
             ans+=arr[i];
        }
 int finalAns = (int) (ans % (int)(1e9 + 7));
        return finalAns;
    }
}