class Solution {
    public long dividePlayers(int[] skill) {

        int len = skill.length;
        long sum = 0;
        if(skill.length == 2) {

            sum = skill[0] * skill[len - 1];
            return sum;
        }



        Arrays.sort(skill);
        int start=0;
        int end=len-1;
        int tempSum=skill[start]+skill[end];
        while(start<end){
           

           if(skill[start]+skill[end]==tempSum){
            sum+=skill[start]*skill[end];
            start++;
            end--;

           }else{
            return -1;
           }
        }
                return sum;

    }
}