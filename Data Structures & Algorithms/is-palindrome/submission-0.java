class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                s1 += Character.toLowerCase(s.charAt(i));
            }
        }
        int i = 0, j = s1.length()-1;
        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
