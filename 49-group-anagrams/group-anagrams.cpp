class Solution {
public:
 std::array<int,256>hash(string s){
   std::array<int,256>hash={0};
            for(int i=0; i<s.size();i++){
                hash[s[i]]++;
            }
            return hash;
        }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<std::array<int,256>, vector<string>>mp;
        vector<vector<string>>ans;
        
        for(auto str:strs){
               mp[hash(str)].push_back(str);
        }

        for( auto it=mp.begin(); it!=mp.end(); it++){
            ans.push_back(it->second);
        }
        return ans;
  
  
    // vector<vector<string>> groupAnagrams(vector<string>& strs) {
    //     map<string, vector<string>>mp;
    //     vector<vector<string>>ans;
        
    //     for(auto str:strs){
    //           string s=str;
    //           sort(s.begin(),s.end());
    //           mp[s].push_back(str);
    //     }

    //     for( auto it=mp.begin(); it!=mp.end(); it++){
    //         ans.push_back(it->second);
    //     }
    //     return ans;  //Here time complexity =(n klogk) due to the sorting is occured in this.

        //On the above solution the sorting is not included 
        //Therfore T.C=(nk);
        //using hash and map only by ommitting the consideration of the space complexity.



    
    }
};