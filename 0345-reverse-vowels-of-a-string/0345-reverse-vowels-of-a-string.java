class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        int left = 0, right = n - 1;

        while (left < right) {
            // move left pointer until vowel found
            while (left < right && !isVowel(sb.charAt(left))) {
                left++;
            }
            // move right pointer until vowel found
            while (left < right && !isVowel(sb.charAt(right))) {
                right--;
            }

            // swap vowels
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        return sb.toString();
    }

    // helper function to check if character is vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
