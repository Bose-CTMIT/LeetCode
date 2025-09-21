class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        for(int[] num : intervals){
            if( newInterval==null || num[1]<newInterval[0])res.add(num);
            else if(newInterval[1] < num[0]){
                res.add(newInterval);
                res.add(num);
                newInterval=null;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],num[0]);
                newInterval[1]=Math.max(newInterval[1],num[1]);
            }
        }
        if(newInterval!=null)res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}