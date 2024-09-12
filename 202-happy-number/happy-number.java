class Solution {
    public boolean isHappy(int n) {
        

        Set<Integer>seen=new HashSet<>();
        while(!seen.contains(n)){
          seen.add(n);

            int sum=0;
            while(n!=0){
                int bit=n%10;
                sum=sum+bit*bit;
                n=n/10;
            }
            n=sum;
            if(n==1){
                return true;
            }
        }
        return false;
    }
}