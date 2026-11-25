class Solution {
    public String reverseVowels(String s) {
        String vowel="aeiouAEIOU";
        int i=0,j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j){
            while(i<j && vowel.indexOf(c[i])==-1)i++;
            while(i<j && vowel.indexOf(c[j])==-1)j--;
            if(vowel.indexOf(c[i])!=-1 && vowel.indexOf(c[j])!=-1){
                char x=c[i];
                c[i]=c[j];
                c[j]=x;
                i++;j--;
            }
        }
        return new String(c);
    }
}