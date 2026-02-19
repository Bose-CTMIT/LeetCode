class KthLargest {
    private PriorityQueue<Integer> min;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.min=new PriorityQueue<>();
        for(int num:nums){
            min.offer(num);
            if(min.size()>k)min.poll();
        }
    }
    public int add(int val) {
        min.offer(val);
        if(min.size()>k)min.poll();
        return min.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */