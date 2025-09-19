class Solution {
    public String sortVowels(String s) {
        String vowel="AEIOUaeiou";
        List<Character> list=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1) list.add(c);
        }
        Collections.sort(list);
        char[] l=s.toCharArray();
        int index=0;
        for(int i=0;i<s.length();i++){
            if(vowel.indexOf(l[i])!=-1)
            l[i]=list.get(index++);
        }
        String t=new String(l);
        return t;
    }
}