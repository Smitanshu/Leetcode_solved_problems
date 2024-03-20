//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {

        int n=nums.size();

        if(n==0){
            return 0;
        }
        int count=1;
        for(int i=1; i<n ;i++){
  
        if(nums[i]==nums[i-1]){  //if previous==curr_element -->  count remains same .

        }
        else{
            nums[count]=nums[i];
            count++;          //count increse if previous!=curr_emement  is not same 
        }
    }
     return count;   
    }
};
