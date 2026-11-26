class Solution {
    public boolean canAliceWin(int n) {
        /*
        int remove=10;
        boolean alice=false;
        while(n>=remove){
            n-=remove;
            remove--;
            alice=!alice;
        }
        return alice;
        */
        int i=0,count=0;
        while(n>=10-i){
            n=n-(10-i);
            i++;count++;
        }
        if(count%2==1)return true;
        return false;
    }
}