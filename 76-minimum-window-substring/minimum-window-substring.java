class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        if(t.isEmpty())return "";

        HashMap<Character,Integer> countT=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();

        for(char c:t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }
        int have=0,need=countT.size(),retLen=Integer.MAX_VALUE,l=0;
        int[] ret={-1,-1};

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);

            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))){
                have++;
            }

            while(have==need){
                if((r-l+1)<retLen){
                    retLen=r-l+1;
                    ret[0]=l;
                    ret[1]=r;
                }

                char left=s.charAt(l);
                window.put(left,window.get(left)-1);
                if(countT.containsKey(left) && window.get(left)<countT.get(left)){
                    have--;
                }

                l++;
            }
        }
        return retLen==Integer.MAX_VALUE? "":s.substring(ret[0],ret[1]+1);
    }
}