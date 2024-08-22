class Solution {
    public int countSeniors(String[] details) {
        
           int len=details.length;
        int count=0;

        for(int i=0; i<details.length;i++){

            String curr=details[i];


            

                 int a = Character.getNumericValue(curr.charAt(11)) * 10 + Character.       getNumericValue(curr.charAt(12));
              if(a>60){
                count++;
              }

            
        }
       

        return count;
    }
}