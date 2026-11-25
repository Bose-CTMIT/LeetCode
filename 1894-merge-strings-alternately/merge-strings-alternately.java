class Solution {
    public String mergeAlternately(String word1, String word2) {
        /*
        int n=word1.length(),m=word2.length();
        String res="";
        int i=0,j=0;
        while(i<n && j<m){
            res +=""+ word1.charAt(i) + word2.charAt(j);
            i++;j++;
        }
        if(i==n) res += ""+ word2.substring(j,m);
        else res += ""+word1.substring(i,n);

        return res;
        */
        
        int n=word1.length(),m=word2.length();
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        while(i<n && j<m){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        if(i==n) res.append(word2.substring(j,m));
        else res.append(word1.substring(i,n));

        return res.toString();
        
    }
}