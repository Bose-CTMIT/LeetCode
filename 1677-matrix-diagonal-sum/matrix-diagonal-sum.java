class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;

        for(int i=0, j=n-1; i<n && j>=0;i++ , j--){
            if(i==j){
                sum+=mat[i][i];
            }
            else{
                sum = sum+mat[i][i]+mat[i][j];
            }
        }
        return sum;
    }
}