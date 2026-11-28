class Solution {
    public String decodeString(String s) {
        Deque<Integer> digit=new ArrayDeque<>();
        Deque<StringBuilder> str=new ArrayDeque<>();
        StringBuilder cur=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }
            else if(c=='['){
                digit.push(num);
                str.push(cur);
                cur=new StringBuilder();
                num=0;
            }
            else if(c==']'){
                int n=digit.pop();
                StringBuilder repeat=str.pop();
                for(int i=0;i<n;i++){
                    repeat.append(cur);
                }
                cur=repeat;
            }
            else{
                cur.append(c);
            }
        }
        return cur.toString();
    }
}