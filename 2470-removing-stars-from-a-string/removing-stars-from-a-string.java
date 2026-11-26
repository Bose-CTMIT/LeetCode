class Solution {
    public String removeStars(String s) {
        /*
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*')stack.pop();
            else stack.push(c);
        }
        StringBuilder res=new StringBuilder();
        for(char c:stack)res.append(c);

        return res.toString();
        */
        int n=s.length();
        char[] arr=s.toCharArray();
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='*')j--;
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        return new String(arr,0,j);
    }
}