class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length,node=0;
        int[] dist=new int[n];
        boolean[] visit=new boolean[n];
        int edge=0,res=0;
        Arrays.fill(dist,100000000);

        while(edge<n-1){
            int nextnode=-1;
            visit[node]=true;
            for(int i=0;i<n;i++){
                if(visit[i]){
                    continue;
                }
                int curdist=Math.abs(points[i][0]-points[node][0]) + Math.abs(points[i][1]-points[node][1]);
                dist[i]=Math.min(dist[i],curdist);
                if(nextnode==-1|| dist[i] < dist[nextnode]){
                    nextnode=i;
                }
            }
            res+=dist[nextnode];
            node=nextnode;
            edge++;
        }
        return res;
    }
}