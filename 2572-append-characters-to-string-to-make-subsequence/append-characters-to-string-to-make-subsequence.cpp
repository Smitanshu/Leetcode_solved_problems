class Solution {
public:
    int appendCharacters(string s, string t) {

        int start=0;
        int end=0;
        int count=0;
        while(start<s.size() && end<t.size()){

            if(s[start]==t[end]){
               end++;
                
            }
        
                start++;
                
            
        }


    int ans=t.length()-end;
return ans;

    }
};