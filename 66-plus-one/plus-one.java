class Solution {
    public int[] plusOne(int[] digits) {
        int lastNumber = digits.length - 1;
        for(int i = lastNumber; i>=0; i--){
        if(digits[i]!= 9){
            digits[i] = digits[i] + 1;
            break;
        }
        else{
                digits[i] = 0;
                if(i == 0){
                    int[] arr = new int[digits.length + 1];
                    arr[0] = 1;
                    for(int j = 1; j<arr.length; j++){
                        arr[j] = digits[j-1];
                    } 
                    return arr;
                }
            }
        }
        return digits;
    }
}