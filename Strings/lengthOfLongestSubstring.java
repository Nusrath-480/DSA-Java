class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256]; // stores last index + 1 of each character
        int maxLen = 0;
        int start = 0; // starting index of current substring

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if character seen before, move 'start' to the right of its previous index
            if (lastSeen[ch] > 0) {
                start = Math.max(start, lastSeen[ch]);
            }

            // update the character’s last seen position (+1 to avoid confusion with 0)
            lastSeen[ch] = i + 1;

            // calculate window length
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}

