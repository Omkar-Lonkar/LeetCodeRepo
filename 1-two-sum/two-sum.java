class Solution { //omkar
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            hm.put(i, nums[i]);
        }                                                  //0,1,2,3,4
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int total = 0;
                total = hm.get(i) + hm.get(j);
                if(total==target)
                {
                    return new int[]{i,  j};
                }
            }
        }
        return new int[]{};
    }
    
}