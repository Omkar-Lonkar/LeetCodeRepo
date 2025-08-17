class Solution { 
    public int majorityElement(int[] nums) {
    int number = 0;
    int count = 0; 
    for(int num : nums){
        if(count == 0) 
            number = num;
        if(num == number){
            count += 1;
        }
        else{
            count -= 1;
        }
    }
    return number;
}}