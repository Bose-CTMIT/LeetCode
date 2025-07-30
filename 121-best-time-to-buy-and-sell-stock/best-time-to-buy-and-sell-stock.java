class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0,minbuy=prices[0];
        for(int p:prices){
            maxp=Math.max(maxp,p-minbuy);
            minbuy=Math.min(minbuy,p);
        }
        return maxp;
    }
}