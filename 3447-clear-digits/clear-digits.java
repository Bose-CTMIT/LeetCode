class Solution {
    public String clearDigits(String s) {
        String m="0123456789";
        int n=s.length();int j=0;
        char[] a=s.toCharArray();
        for(int i=0;i<n;i++){
            if(m.indexOf(a[i])!=-1)j--;
            else a[j++]=a[i];
        }
        return new String(a,0,j);
    }
}