class Solution {
    public int secondHighest(String s) {
   ArrayList<Integer>arr=new ArrayList<>();
        for(char ch:s.toCharArray()){
           int num=ch-'0';
            if(num>=0 && num<=9){
              arr.add(num);

            }
        }

        int large=-1;
        for(int i=0; i<arr.size();i++){
            if(large<arr.get(i)){
                large=arr.get(i);
            }
        }
        int slarge=-1;
          for(int i=0; i<arr.size();i++){

            if(slarge<arr.get(i)&& arr.get(i)!=large){

                slarge=arr.get(i);
            }
          }


          return slarge;
    }
}