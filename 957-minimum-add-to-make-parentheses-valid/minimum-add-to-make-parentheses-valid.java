class Solution {
    public int minAddToMakeValid(String s) {
        /*
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')' && !stack.isEmpty() && stack.peek()=='(')stack.pop();
            else stack.push(c);
        }
        return stack.size();
        
        int n=s.length();
        int j=0;
        char[] a=s.toCharArray();
        for(int i=0;i<n;i++){
            if(a[i]==')' && j>0 && a[j-1]=='(' )j--;
            else a[j++]=a[i];
        }
        return j;
        */
        int open=0,close=0;
        for(char c:s.toCharArray()){
            if(c=='(')open+=1;
            else{
                if(open==0)close+=1;
                else open-=1;
            }
        }
        return open+close;
    }
}