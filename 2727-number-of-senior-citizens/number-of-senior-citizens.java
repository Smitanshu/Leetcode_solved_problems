class Solution {
    public int countSeniors(String[] details) {
        
           int len=details.length;
        int []nums=new int[details.length];
        int index=0;

        for(int i=0; i<details.length;i++){

            String curr=details[i];


            for(int j=0; j<1;j++){

                 int a = Character.getNumericValue(curr.charAt(11)) * 10 + Character.getNumericValue(curr.charAt(12));
               nums[index]=a;
               index++;

            }
        }
        int count=0;

        for(int i=0; i<nums.length;i++){

            if(nums[i]>60){
                count++;
            }
        }

        return count;
    }
}