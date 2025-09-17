class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0],Math.max(rob1(Arrays.copyOfRange(nums,0,nums.length-1)),
        rob1(Arrays.copyOfRange(nums,1,nums.length))));
    }
    private int rob1(int[] num){
        int rob1=0,rob2=0;
        for(int n:num){
            int newrob=Math.max(n+rob1,rob2);
            rob1=rob2;
            rob2=newrob;
        }
        return rob2;
    }
}