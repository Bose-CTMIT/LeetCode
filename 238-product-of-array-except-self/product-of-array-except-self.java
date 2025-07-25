class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> zero=new ArrayList<>();
        //int[] zero=new int[nums.length];
        int product=1,j=0,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero.add(i);
            }
            else{
            product=product*nums[i];
            }
        }
        int[] ret=new int[nums.length];
        if(zero.size()==0){
            for(int i=0;i<nums.length;i++){
                res=product;
                ret[i]=res/nums[i];
            }
            return ret;
        }
        else if(zero.size()==1){
            Arrays.fill(ret,0);
            ret[zero.get(0)]=product;
            return ret;
        }
        else{
            Arrays.fill(ret,0);
            return ret;
        }
    }
}