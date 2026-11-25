class Solution {
    public boolean isSubsequence(String s, String t) {
        /*int s1=0,t1=0;
        while(s1<s.length() && t1<t.length()){
            if(s.charAt(s1)==t.charAt(t1)) s1++;
            t1++;
        }
        return s1==s.length();*/
        int start=0;
        for(int i=0;i<s.length();i++){
            int found=0;
            for(int j=start;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    found=1;
                    start=j+1;
                    break;
                }
            }
            if(found==0)return false;
        }
        return true;
    }
}