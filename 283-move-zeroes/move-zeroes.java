class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) continue;
            if(i!=j){
                nums[j]=nums[i];
                nums[i]=0;
            }
            j++;
        }
    }
}