class Solution {
public:
    int minSwaps(string s) {
        stack<char>stk;
        int count=0;
        for(int i=0; s[i]!='\0';i++){


           if(s[i]=='['){
            stk.push('[');
           }else{

            if(!stk.empty()){
                stk.pop();
            }
            else{
                count++;
            }
           }
        }
        return ((count+1)/2);
    }
};