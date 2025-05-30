class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixsum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //base case 

        for(int num: nums){
            prefixsum += num;

            if(map.containsKey(prefixsum - k)){
                count += map.get(prefixsum - k);
            }

            map.put(prefixsum, map.getOrDefault(prefixsum, 0) +1);
        }
        return count;
    }
}