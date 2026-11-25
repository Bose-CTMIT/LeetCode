class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count0=0,count1=0,res=0;
        for(int x:flowerbed){
            if(x==0){
                if(count1>0) count1--;
                else if(count1==0 && count0==1){res++; count0=0;}
                else count0++;
            } 
            else {count1++;count0=0;}
        }
        if(count0==1)res++;
        return res>=n?true:false;
    }
}