class Solution {
    public int strStr(String haystack, String needle) {
        String s = haystack;
        String n = needle;
        if (n.isEmpty()) {
            return 0;
        }
        int i = s.indexOf(n);
        if (i == -1) {
            return -1;
        }
        return i;
    }
}