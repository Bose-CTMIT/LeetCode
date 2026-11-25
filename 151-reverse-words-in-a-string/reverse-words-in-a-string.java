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
        for(int i = str.length-1; i>=1; i--){
            sb.append(str[i]);
            sb.append(" "); 
        }
        sb.append(str[0]);
        return sb.toString();
    }
}