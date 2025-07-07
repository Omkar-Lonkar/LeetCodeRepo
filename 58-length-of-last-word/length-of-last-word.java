class Solution {
    public int lengthOfLastWord(String s) {
        int n = 0;
        char[] ch = s.toCharArray();
        int i = ch.length-1;
        while(i>=0 && Character.isWhitespace(ch[i])){
            i--;
        }
        while(i>=0 && !Character.isWhitespace(ch[i])){
            i--;
            n++;
        }
        return n;

    }
}