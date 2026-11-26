class Solution {
    public int findMiddleIndex(int[] nums) {
        /*
        int sum=0;
        for(int n:nums)sum+=n;
        int suml=0;
        for(int i=0;i<nums.length;i++){
            int sumr=sum-suml-nums[i];
            if(suml==sumr)return i;
            suml+=nums[i];
        }
        return -1;
        */
        int tot=0,n=nums.length,suml=0,sumr;
        for(int i=0;i<n;i++){
            tot=tot+nums[i];
        }
        for(int i=0;i<n;i++){
            sumr=tot-suml-nums[i];
            if(suml==sumr){
                return i;
            }
            else{
                suml=suml+nums[i];
            }
        }
        return -1;
    }
}