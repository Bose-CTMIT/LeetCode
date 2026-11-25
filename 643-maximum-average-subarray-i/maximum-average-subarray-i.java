class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cur=0;
        for(int i=0;i<k;i++){
            cur+=nums[i];
        }
        int max=cur;
        for(int i=k;i<nums.length;i++){
            cur+=nums[i]-nums[i-k];
            max=Math.max(max,cur);
        }
        return (double)max/k;
    }
}