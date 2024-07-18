class Solution {
public:
    void sortColors(vector<int>& nums) {

        // int left=0;
        // int right=nums.size()-1;
        // int index=0;
        //  while(index<=right){

        //      if(nums[index]==0){
        //          swap(nums[index], nums[left]);
        //          index++;
        //          left++;

        //      }
        //      else if(nums[index]==2){
        //          swap(nums[index], nums[right]);
        //          right--;
        //      }

        //      else{
        //          index++;
        //      }
        //  } 
  
    

      int left=0, mid=0, h=nums.size()-1;

      while(mid<=h){

          if(nums[mid]==0){
              swap(nums[left], nums[mid]);
              left++;
              mid++;
          }

          else if(nums[mid]==1){
              mid++;
          }

          else {
              swap(nums[mid], nums[h]);
              h--;
          }
      }





    }
};