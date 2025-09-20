class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:stones){
            maxheap.offer(num);
        }
        while(maxheap.size()>1){
            int x=maxheap.poll();
            int y=maxheap.poll();
            if(x!=y) maxheap.offer(x-y);
            if(maxheap.size()==1 || maxheap.size()==0){
                break;
            }
        }
        if(maxheap.size()==1)return maxheap.peek();
        return 0;
    }
}