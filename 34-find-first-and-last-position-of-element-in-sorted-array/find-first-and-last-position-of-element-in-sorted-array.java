class Solution {
    public int[] searchRange(int[] nums, int target)    {
        int start = 0; 
        int end = nums.length -1;
        int first = -1;
        int last = -1;

        if(nums.length == 0){
            return new int[]{-1, -1};
        }

        while(start<=end){
        int mid = start + (end - start) / 2;
        
        if(target == nums[mid]){
            end = mid - 1;
            first = mid;
        }
        else if(target<nums[mid]){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }}

        start = 0; 
        end = nums.length - 1;

        while(start<=end){
        int mid = start + (end - start) / 2;
       
        if(target == nums[mid]){
            start = mid + 1;
            last = mid;
        }
        else if(target<nums[mid]){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }}
        return new int[]{first, last};
    }
    
}