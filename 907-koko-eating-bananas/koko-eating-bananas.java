class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=piles[0],max=-1;
        for(int num:piles){
            if(num>max){
                max=num;
            }
        }
        for(int num:piles){
            if( num<min ){
                min=num;
            }
        }
        int l=1,r=max;
        int ret=r;
        while(l<=r){
            int mid=(l+r)/2;
            long time=0;
            for(int p:piles){
                time += Math.ceil((double)p/mid);
            }
            if(time<=h){
                ret=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ret;
    }
}