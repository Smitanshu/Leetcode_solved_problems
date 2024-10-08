class Solution {
    public int minSwaps(String s) {

     int count = 0;
        int max_count = 0;
        for (int i = 0; i<s.length(); i++) {

            if (s.charAt(i)== '[') {
                count = count - 1;
            } else {
                count = count + 1;
            }

            if (max_count < count) {
                max_count = count;
            }
        }
        return ((max_count + 1) / 2);
        
    }
}


// class Solution {
// public:
//     int minSwaps(string s) {
//         stack<char>stk;
//         int count=0;
//         for(int i=0; s[i]!='\0';i++){

//            if(s[i]=='['){
//             stk.push('[');
//            }else{

//             if(!stk.empty()){
//                 stk.pop();
//             }
//             else{
//                 count++;
//             }
//            }
//         }
//         return ((count+1)/2);
//     }
// };

// Optimized Approach :
// class Solution {
// public:
//     int minSwaps(string s) {

//         int count = 0;
//         int max_count = 0;
//         for (int i = 0; s[i] != '\0'; i++) {

//             if (s[i] == '[') {
//                 count = count - 1;
//             } else {
//                 count = count + 1;
//             }

//             if (max_count < count) {
//                 max_count = count;
//             }
//         }
//         return ((max_count + 1) / 2);
//     }
// };