class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack=new Stack<>();
        int n=temperatures.length;
        int[] ret=new int[n];
        int index=0;

        stack.push(new int[]{temperatures[0],0});
        
        for (int i=1;i<n;i++){
            int[] a=stack.peek();
            if(a[0] < temperatures[i]){
                while(!stack.isEmpty()){
                    int[] top=stack.peek();
                    if( top[0] >= temperatures[i] ){
                        break;
                    }
                    else{
                        int[] top1=stack.pop();
                        ret[top1[1]]=i-top1[1];
                    }
                }
               stack.push(new int[]{temperatures[i],i});
            }
            else{
                stack.push(new int[]{temperatures[i],i});
            }
        }
        ret[n-1]=0;

        return ret;
    }
}