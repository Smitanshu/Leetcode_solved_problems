class Solution {
    public boolean isPalindrome(int x) {
        
    int num=Math.abs(x);
    int reverse=0;
    int i=0;
    while(num!=0){
        int bit=num%10;
        reverse=reverse*10+bit;
        num=num/10;
    }
  
if(reverse==x){
    return true;
}
return false;
    }
}