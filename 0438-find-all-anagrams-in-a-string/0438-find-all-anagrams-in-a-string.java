class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length(), m = p.length();
        if (n < m) return ans;

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        // first window
        for (int i = 0; i < m; i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        if (sMap.equals(pMap)) ans.add(0);

        for (int i = m; i < n; i++) {
            char add = s.charAt(i);
            char remove = s.charAt(i - m);

            sMap.put(add, sMap.getOrDefault(add, 0) + 1);

            sMap.put(remove, sMap.get(remove) - 1);
            if (sMap.get(remove) == 0) sMap.remove(remove);

            if (sMap.equals(pMap)) {
                ans.add(i - m + 1);
            }
        }
        return ans;
    }
}
