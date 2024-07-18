import java.util.*;
class Solution {

    public void sortColors(int[] nums) {


         int left=0;
        int right=nums.length-1;
        int index=0;
         while(index<=right){

             if(nums[index]==0){
                // swap(nums[index], nums[left]);
                 int temp=nums[index];
                 nums[index]=nums[left];
                 nums[left]=temp;
                 index++;
                 left++;

             }
             else if(nums[index]==2){
                 //swap(nums[index], nums[right]);
                 int temp=nums[index];
                 nums[index]=nums[right];
                 nums[right]=temp;
                 right--;
             }

             else{
                 index++;
             }
         } 
  
   
    }
}