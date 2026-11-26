class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> map=new HashMap<>();
        for(int[] row:grid){
            List<Integer> list=new ArrayList<>();
            for(int r:row) list.add(r);
            map.put(list,map.getOrDefault(list,0)+1);
        }
        int res=0;
        for(int r=0;r<grid.length;r++){
            List<Integer> x=new ArrayList<>();
            for(int c=0;c<grid[0].length;c++) x.add(grid[c][r]);
            res+= map.getOrDefault(x,0);
        }
        return res;
    }
}