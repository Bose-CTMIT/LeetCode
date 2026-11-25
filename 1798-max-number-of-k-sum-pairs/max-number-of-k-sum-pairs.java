class Solution {
    public int maxOperations(int[] nums, int k) {
        /*
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int num:nums){
            int x=k-num;
            if(map.getOrDefault(x,0)>0){
                res++;
                map.put(x,map.get(x)-1);
            }
            else map.put(num,map.getOrDefault(num,0)+1);
        }
        return res;
        */
        Arrays.sort(nums);
        int l=0,r=nums.length-1,res=0;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==k){
                res++;
                l++;
                r--;
            }
            else if(sum<k)l++;
            else r--;
        }
        return res;
    }
}