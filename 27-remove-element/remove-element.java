class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        int count = 0;
        for (int n : list) {
            if (n != val) {
                nums[count++] = n;
            }
            }
            return count;
    }
}