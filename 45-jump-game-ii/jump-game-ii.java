class Solution {
    public int jump(int[] nums) {



       int count=0;
       int max=0;
       int pos=0;
        for(int i=0; i<nums.length-1;i++){
             
             max=Math.max(max,nums[i]+i);

             if(pos==i){
                pos=max;
                count++;

             }


        }
        return count;
        
    }
}