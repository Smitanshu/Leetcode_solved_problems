class Solution {
    public:
     int sumOfTheDigitsOfHarshadNumber(int x) {

         int num=x;
         int sum=0;

        while(num!=0){
            int bit=num%10;

            num=num/10;
            sum=sum+bit;
        }
 
       if(x%sum!=0){
        return -1;
       }
        return sum;
    }
};