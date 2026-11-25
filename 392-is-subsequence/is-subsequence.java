class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())return false;
        int s1=0,t1=0;
        while(s1<s.length() && t1<t.length()){
            if(s.charAt(s1)==t.charAt(t1)) s1++;
            t1++;
        }
        return s1==s.length();
    }
}