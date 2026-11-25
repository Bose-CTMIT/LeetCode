class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        /*
        int i=0,j=str.length-1;
        while(i<j){
            String x=str[i];
            str[i]=str[j];
            str[j]=x;
            i++;j--;
        }
        return String.join(" ",str);
        */

        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1; i>=0; i--){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(str[i]);   
        }
        return sb.toString();
    }
}