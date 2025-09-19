class Solution {
    public boolean doesAliceWin(String s) {
        String vowel="aeiou";
        int count=0;
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1)count++;
        }
        if(count==0)return false;
        return true;
    }
}