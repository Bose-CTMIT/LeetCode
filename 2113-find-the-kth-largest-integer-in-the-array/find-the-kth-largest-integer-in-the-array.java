class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> q=new PriorityQueue<>((a,b) -> a.length() == b.length()?a.compareTo(b): Integer.compare(a.length(),b.length()));
        for(String s:nums){
            q.add(s);
            if(q.size()>k)q.poll();
        }
        return q.peek();
    }
}