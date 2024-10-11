class Solution {
public:
    int maxWidthRamp(vector<int>& nums) {

        int ans = 0;
        int len = nums.size();

        vector<pair<int, int>> vp;

        for (int i = 0; i < len; i++) {

            vp.push_back({nums[i], i});
        }

        sort(vp.begin(), vp.end());

        int minIndex = vp[0].second;
        for (int i = 1; i < len; i++) {

         ans=max(ans, vp[i].second-minIndex);
         minIndex=min(minIndex, vp[i].second);

        }
        return ans;
    }
};