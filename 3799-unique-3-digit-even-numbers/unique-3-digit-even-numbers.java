class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];int res=0;
        for(int n:digits) freq[n]++;
        for(int i=100;i<=998;i+=2){
            int hun=i/100;
            int ten=(i/10)%10;
            int dig=i%10;
            freq[hun]--;
            freq[ten]--;
            freq[dig]--;
            if(freq[hun]>=0 && freq[ten]>=0 && freq[dig]>=0)res++;
            freq[hun]++;
            freq[ten]++;
            freq[dig]++;
        }
        return res;
    }
}