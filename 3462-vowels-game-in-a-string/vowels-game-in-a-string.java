class Solution {
    public boolean doesAliceWin(String s) {
        String vowel="aeiou";
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1)return true;
        }
        return false;
    }
}