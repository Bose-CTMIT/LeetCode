class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0, max=0;
        for(int n:nums){
            if(n==1)res++;
            else{
                max=Math.max(res,max);
                res=0;
            }
        }
        max=Math.max(max,res);
        return max;
    }
}