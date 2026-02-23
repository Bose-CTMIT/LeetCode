class Solution {
    public int reverseBits(int n) {
        int i=0;
        int res=0;
        while(i<32){
            int k=n&1;
            n=n>>1;
            res=res<<1 | k;
            i++;
        }
        return res;
    }
}