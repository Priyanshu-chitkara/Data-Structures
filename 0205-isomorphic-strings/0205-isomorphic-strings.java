class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mp = new HashMap<>();  // s → t
        HashMap<Character, Character> mpp = new HashMap<>(); // t → s

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check existing mapping s -> t
            if (mp.containsKey(ch1)) {
                if (mp.get(ch1) != ch2) {
                    return false; // inconsistent mapping
                }
            } else {
                mp.put(ch1, ch2); // create new mapping
            }

            // Check reverse mapping t -> s
            if (mpp.containsKey(ch2)) {
                if (mpp.get(ch2) != ch1) {
                    return false; // inconsistent reverse mapping
                }
            } else {
                mpp.put(ch2, ch1); // create new reverse mapping
            }
        }

        return true;
    }
}
