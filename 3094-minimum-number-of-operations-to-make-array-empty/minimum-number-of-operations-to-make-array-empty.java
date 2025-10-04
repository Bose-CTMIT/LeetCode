class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
            for(int num:map.values()){
                if(num==1){
                    return -1;
                }
                else if(num==2){
                    count++;
                }
                else if(num%3==0){
                    count+=num/3;
                }
                else{
                    count=count+(num/3)+1;
                }
            }
        return count;
    }
}