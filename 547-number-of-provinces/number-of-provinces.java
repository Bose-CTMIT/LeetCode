class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length,province=0;
        for(int i=0;i<n;i++){
            if(isConnected[i][i]==1){
                province++;
                dfs(isConnected,i);
            }
        }
        return province;
    }
    private void dfs(int[][] arr,int city){
        arr[city][city]=0;
        for(int i=0;i<arr.length;i++){
            if(arr[city][i]==1 && arr[i][i]==1)dfs(arr,i);
        }
    }
}