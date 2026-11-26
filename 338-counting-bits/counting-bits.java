class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            int count=0;
            int temp=i;
            while(temp>0){
                if(temp%2==1)count++;
                temp/=2;
            }
            res[i]=count;
        }
        return res;
    }
}