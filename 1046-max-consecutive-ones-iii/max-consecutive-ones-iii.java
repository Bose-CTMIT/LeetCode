class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,r=0,max=0,k1=0;
        while (i<nums.length ){
            if(nums[i]==0)k1++;
            while(k1>k){
                if(nums[r]==0)k1--;
                r++;
            }
            max=Math.max(max,i-r+1);i++;
        }
        return max;
    }
}