class Solution {
public:
    int missingNumber(vector<int>& nums) {
  // Approach 1 using Arithmetic progression:


    //    int size=nums.size();
    // int ans=0;
    // for (int i = 0; i < size; i++)
    // {
    //      ans = ans + nums[i];
    // }
    //   int ans1=((size)*(size+1))/2;
    //   int ans2=ans1-ans;
    //   return ans2;


    //Approach2  using XOR:

     int ans=0; // 0^ 0=0;
     int n=nums.size();

     //Xor of array:
     for(int i=0; i<n; i++){
         ans=ans^nums[i];
     }

     for(int i=0; i<=n; i++){ //i<=n for range[0,n]
          ans=ans^ i;
     }
    return ans;

    }
    
    
};