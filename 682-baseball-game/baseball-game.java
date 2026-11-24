class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("C"))stack.pop();
            else if(s.equals("D"))stack.push(2* stack.peek());
            else if(s.equals("+")){
                int x=stack.pop();
                int y=stack.peek();
                stack.push(x);
                stack.push(x+y);
            }
            else stack.push(Integer.parseInt(s));
        }
        int res=0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}