class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b) -> Integer.compare(b[0],a[0]));

        int fleets=1;
        double prevtime=(double) (target-pair[0][0])/pair[0][1];

        for(int i=0;i<n;i++){
            double currtime=(double) (target-pair[i][0])/pair[i][1];
            if(prevtime<currtime){
                fleets++;
                prevtime=currtime;
            }
        }
        return fleets;
    }
}