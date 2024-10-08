class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int len = arr.length;
        Integer[] sorted = new Integer[len];
        int[] unique = new int[len];

        for (int i = 0; i < len; i++) {
            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);
        
HashMap<Integer, Integer>rankmp=new HashMap<>();
   int rank=1;
   for(int  num :sorted){
    if(!rankmp.containsKey(num)){
      rankmp.put(num, rank++);
    }
   }
         int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = rankmp.get(arr[i]);
        }
        return result;

    }
}