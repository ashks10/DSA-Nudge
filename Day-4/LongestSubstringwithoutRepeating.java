class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0 ;
        int left = 0 ;
        int maxlen = 0 ;

        HashSet<Character> seen = new HashSet<>();

        while(right<s.length()){
            if(!seen.contains(s.charAt(right))){
                seen.add(s.charAt(right));
                maxlen = Math.max(maxlen , right - left +1);
                right++;
            }else{
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}
//sliding window method is used to solve from left to right