class Solution {
    public int trap(int[] height) {
        if( height == null || height.length == 0){
            return 0;
        }
        int l=0,r=height.length-1,lm=height[l],rm=height[r],fill=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm=Math.max(lm,height[l]);
                fill+= lm-height[l];
            }
            else{
                r--;
                rm=Math.max(rm,height[r]);
                fill+= rm-height[r];
            }
        }
        return fill;
    }
}