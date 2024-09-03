class Solution {
    public int chalkReplacer(int[] chalk, int k) {
      int ans=0;
        outer:
        while(true){
            for(int i=0; i<chalk.length;i++){

                if(chalk[i]<=k){
                    k=k-chalk[i];
                }else{
                    ans=i;
                    break outer;
                }
            }
        
        }

        return ans;
        
    }
}