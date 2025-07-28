class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=-1;
        while(l<r){
            int temp = Math.min(height[l],height[r]) * (r-l);
            max = Math.max(temp,max);
            if(height[r]>height[l]){l++;}
            else {r--;}
        }
        return max;
    }
}