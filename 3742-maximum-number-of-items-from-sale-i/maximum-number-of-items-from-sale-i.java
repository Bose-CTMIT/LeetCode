class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] gain=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){
                if(i!=j && items[j][0]%items[i][0]==0)count++;
            }
            gain[i]=count;
            min=Math.min(min,items[i][1]);
        }
        int[] dp=new int[budget+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=0;i<n;i++){
            int price=items[i][1];
            int ga=gain[i];
            for(int j=budget;j>=price;j--){
                if(dp[j-price]!=-1) dp[j]=Math.max(dp[j],dp[j-price]+ga);
            }
        }
        int res=0;
        for(int i=0;i<=budget;i++){
            if(dp[i]!=-1){
                int extra=(budget-i)/min;
                res=Math.max(res, dp[i]+extra);
            }
        }
        return res;
    }
}