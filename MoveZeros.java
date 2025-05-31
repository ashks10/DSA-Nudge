class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroIndex = 0;

        for(int i=0 ; i< nums.length;i++){
            if(nums[i] != 0){
                nums[nonzeroIndex] = nums[i];
                nonzeroIndex++;
            }
        }
        while(nonzeroIndex < nums.length){
            nums[nonzeroIndex] = 0;
            nonzeroIndex++;
        }
    }
}