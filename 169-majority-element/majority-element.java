class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int number = 0;
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > max){
                max = count;
                number = nums[i];
            }
            if(max == nums.length){
                return nums[0];
            }
        }
        return number;
        
    }
}