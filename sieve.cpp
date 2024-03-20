// [1752] Check if Array Is Sorted and Rotated.
//Link:
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
#include <iostream>
#include <vector>
using namespace std;
class Solution
{
public:
    bool check(vector<int> &nums)
    {
        int n = nums.size();
        int cnt = 0;
        for (int i = 1; i < n; i++)
        {
            if (nums[i - 1] > nums[i])
            {
                cnt++;
            }
        }
        if (nums[n - 1] > nums[0])
        {
            cnt++;
        }
        return cnt <= 1;
    }
};
int main()
{
    Solution obj; // Instance of the Solution class
    vector<int> nums{3, 4, 5, 1, 2}; 
    bool result = obj.check(nums); //Function call
    cout << (result ? "True" : "False") << endl;
    return 0;
}
