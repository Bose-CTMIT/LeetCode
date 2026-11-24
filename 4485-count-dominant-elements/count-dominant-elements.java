class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1)return 1;
        int count=0;
        if(nums[0]>=nums[1])count++;
        if(nums[nums.length-1]>=nums[nums.length-2])count++;
        for(int i=1;i<nums.length-1;i++){
            int temp = (int)(nums[i-1]+nums[i+1]+1)/2;
            if(temp <= nums[i]) count++;
        }
        return count;

        /*
        int n=nums.length;
        if(n==1)return 1;
        int count=0;
        for(int i=0;i<n;i++){
            long sum=0;int cou=0;
            if(i>0){
                sum+=nums[i-1];
                cou++;
            }
            if(i<n-1){
                sum+=nums[i+1];
                cou++;
            }
            if((long)nums[i]*cou>=sum)count++;
        }
        return count;*/
    }
}