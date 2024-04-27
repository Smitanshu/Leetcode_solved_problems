//https://leetcode.com/problems/valid-anagram/
class Solution {
public:


    bool isAnagram(string s, string t) {
    //     sort(s.begin(), s.end());
    //     sort(t.begin(), t.end());
        
    //  return s==t;
 


    int arr[256]={0};

    for(int i=0; i<s.size(); i++){
        arr[s[i]]++;
    } //o(n)
    for(int j=0; j<t.size(); j++){
        arr[t[j]]--;
    }
     //O(m);
    for(int i=0; i<256; i++){
        if(arr[i] !=0){
            return false;
        }
    }

   //O(256)=O(1); constant time 
   //Time complexity:O(N+M +1)===> [  O(N+M)  ]
return true;

      

    }
};
