class Solution {
    public int largestAltitude(int[] gain) {
        int cur=0, max=0;
        for(int n:gain){
            cur+=n;
            max=cur>max?cur:max;
        }
        return max;
    }
}