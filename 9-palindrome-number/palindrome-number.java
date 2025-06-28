class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        if (x < 0) return false;
        List<Integer> digits = new ArrayList<>();
        while (num != 0) {
            digits.add(num % 10);
            num /= 10;
        }

        int left = 0, right = digits.size() - 1;
        while (left < right) {
            if (!digits.get(left).equals(digits.get(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}
