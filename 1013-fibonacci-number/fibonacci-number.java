class Solution {
    public int fib(int n) {
        int one=0,two=1;
        for(int i=0;i<n;i++){
            int temp=one;
            one+=two;
            two=temp;
        }
        return one;
    }
}