class Solution {
public:
    string reverseStr(string s, int k) {
        int n = s.size();
        for (int start = 0; start < n; start += 2 * k) {
            int end = std::min(start + k - 1, n - 1);
            std::reverse(s.begin() + start, s.begin() + end + 1);
        }
        
        return s;
        
    }
};