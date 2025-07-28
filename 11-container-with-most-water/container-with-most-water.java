class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=-1;
        while(l<r){
            int heigh=Math.min(height[l],height[r]);
            int temp = heigh * (r-l);
            max = Math.max(temp,max);
            
            while(l<r && height[l]<=heigh)l++;
            while(l<r && height[r]<=heigh)r--;

        }
        return max;
    }
}