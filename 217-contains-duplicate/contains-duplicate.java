class Solution {
    public boolean containsDuplicate(int[] nums) {
    
        Arrays.sort(nums);

    // Check for duplicates by comparing adjacent elements
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            return true; // Duplicate found
        }
    }
    return false; // No duplicates found
}
}