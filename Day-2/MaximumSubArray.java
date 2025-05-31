class Solution {
    public int maxSubArray(int[] nums) {
        int maxSofar = nums[0];
        int currentSum = nums[0];

        for(int i = 1 ; i<nums.length ; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSofar = Math.max(maxSofar, currentSum);
        }
        return maxSofar;
    }
}