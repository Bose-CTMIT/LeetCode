class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int curmax=1,curmin=1;

        for(int num:nums){
            int temp=num*curmax;
            curmax=Math.max(Math.max(temp,num*curmin),num);
            curmin=Math.min(Math.min(temp,num*curmin),num);
            res=Math.max(res,curmax);
        }
        return res;
    }
}