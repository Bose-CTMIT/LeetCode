class Solution {
    public int compress(char[] chars) {
        int read=0,write=0;
        while(read<chars.length){
            char cur=chars[read];
            int count=0;
            while( read<chars.length && chars[read]==cur){
                count++;
                read++;
            }
            chars[write++]=cur;
            if(count>1){
                for(char c:String.valueOf(count).toCharArray()) chars[write++]=c;
            }
        }
        return write;
    }
}