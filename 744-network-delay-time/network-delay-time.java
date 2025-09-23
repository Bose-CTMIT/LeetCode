class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> edges=new HashMap<>();
        for(int[] time:times){
            edges.computeIfAbsent(time[0],
            key -> new ArrayList<>()).add(new int[]{time[1],time[2]});
        }
        PriorityQueue<int[]> minheap=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        minheap.offer(new int[]{0,k});
        int t=0;
        Set<Integer> visited=new HashSet<>();

        while(!minheap.isEmpty()){
            int[] cur=minheap.poll();
            int w1=cur[0],n1=cur[1];
            if(visited.contains(n1))continue;
            visited.add(n1);
            t=w1;

            if(edges.containsKey(n1)){
                for(int[] edge:edges.get(n1)){
                    int n2=edge[0],w2=edge[1];
                    if(!visited.contains(n2)){
                        minheap.offer(new int[]{w1+w2,n2});
                    }
                }
            }
        }
        return visited.size()==n?t:-1;
    }
}