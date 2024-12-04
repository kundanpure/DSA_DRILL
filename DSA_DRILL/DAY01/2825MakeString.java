class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0; // for str2
        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            char ch = str1.charAt(i);
            char ch1 = str2.charAt(j);
            // match or not by incrementing
            if (ch == ch1 || (ch + 1 - 'a') % 26 + 'a' == ch1) {
                j++; // Move pointer for str2
            }
        }
        // If we've processed all characters in str2, return true
        return j == str2.length();
    }
}
