class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,k=0;
        for(int n:nums){
            if(n==0)k++;
            if(k>1){
                if(nums[r]==0)k--;
                r++;
            }
            l++;
        }
        return nums.length-r-1;
    }
}