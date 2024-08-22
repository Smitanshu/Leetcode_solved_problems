class Solution {
    public int findComplement(int num) {
        
    // int mask = (Integer.highestOneBit(num) << 1) - 1;
    // return num ^ mask;




String binary = Integer.toBinaryString(num);
    StringBuilder complement = new StringBuilder();
    
    for (char bit : binary.toCharArray()) {
        complement.append(bit == '0' ? '1' : '0');
    }
    
    return Integer.parseInt(complement.toString(), 2);


}

}