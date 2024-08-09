class Solution {
    public boolean isPalindrome(String s) {

        if (s == null || s.isEmpty()) {

            return true;
        }
        int start = 0;
        int end = s.length() - 1;
         s=s.toLowerCase();
        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;

            }

            if (s.charAt(start) !=s.charAt(end)) {

                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}