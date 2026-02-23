class Solution {
    public boolean hasAllCodes(String s, int k) {
        /*if(s.length()<k)return false;
        Set<String> set=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        return set.size()==(1<<k);
        */
        int need=1<<k;
        boolean[] se=new boolean[need];
        int count=0;int num=0;
        for(int i=0;i<s.length();i++){
            num=((num<<1)&(need-1))| s.charAt(i)-'0' ;
            if(i>=k-1 && !se[num]){
                se[num]=true;
                count++;
                if(count == need)return true;
            }
        }
        return false;
    }
}