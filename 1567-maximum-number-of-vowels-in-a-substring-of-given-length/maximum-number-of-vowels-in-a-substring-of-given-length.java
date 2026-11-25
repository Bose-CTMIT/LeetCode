class Solution {
    public int maxVowels(String s, int k) {
        /*
        String v="aeiou";
        int cur=0;
        for(int i=0;i<k;i++){
            if(v.indexOf(s.charAt(i))!=-1)cur++;
        }
        int max=cur;
        for(int i=k;i<s.length();i++){
            if(v.indexOf(s.charAt(i-k))!=-1)cur--;
            if(v.indexOf(s.charAt(i))!=-1)cur++;
            max=Math.max(max,cur);
        }
        return max;
        */
        int cur=0;
        char[] c=s.toCharArray();
        char[] ch=new char[128];
        ch['a']++;ch['e']++;ch['i']++;ch['o']++;ch['u']++;
        for(int i=0;i<k;i++){
            if(ch[c[i]]==1)cur++;
        }
        int max=cur;
        for(int i=k;i<s.length();i++){
            if(ch[c[i]]==1)cur++;
            if(ch[c[i-k]]==1)cur--;
            max=Math.max(max,cur);
        }
        return max;
    }
}