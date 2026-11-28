class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int factor=0,minprice=Integer.MAX_VALUE;
        for(int[] item:items){
            factor=Math.max(factor,item[0]);
            minprice=Math.min(minprice,item[1]);
        }
        int[] mulcount=new int[factor+1];
        for(int[] item:items){
            mulcount[item[0]]++;
        }
        for(int i=1;i<=factor;i++){
            if(mulcount[i]>0){
                for(int j=2*i;j<=factor;j+=i){
                    mulcount[i]+=mulcount[j];
                }
            }
        }
        Arrays.sort(items, (a,b)->Integer.compare(a[1],b[1]));
        int rem=budget, count=0;

        for(int[] item:items){
            int fac=item[0];
            int price=item[1];
            if(price>=2*minprice)break;

            int avail=mulcount[fac]-1;
            if(avail>0){
                int deals=Math.min(avail,rem/price);
                count+=2*deals;
                rem-= deals*price;
            }
        }
        count+=rem/minprice;
        return count;
    }
}