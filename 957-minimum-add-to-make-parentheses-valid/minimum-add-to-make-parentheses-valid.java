class Solution {
    public int minAddToMakeValid(String s) {
       
        int open=0,close=0;
        for(char c:s.toCharArray()){
            if(c=='(')open+=1;
            else{
                if(open==0)close+=1;
                else open-=1;
            }
        }
        return open + close;
    }
}