class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas) < sum(cost))return -1;
        int total=0,res=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                res=i+1;
            }
        }
        return res;


        
    }
    private int sum(int[] arr){
        int total=0;
        for(int num:arr){
            total+=num;
        }
        return total;
    }
}