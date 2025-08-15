
class Solution {
    public int singleNumber(int[] nums) {
        Stack<Integer> stack = new Stack();
        for(int i = 0; i<nums.length; i++){
            if(stack.contains(nums[i])){
                stack.remove(Integer.valueOf(nums[i]));
            }
            else{
                stack.push(nums[i]);
            }
        }
        return (int)stack.peek();
    }
}