class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>> list= new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add("");

        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                for(String left:list.get(j)){
                    for(String right:list.get(i-j-1)){
                        list.get(i).add( "(" + left + ")" + right);
                    }
                }
            }
        }
        return list.get(n);
    }
}