class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int j=mat[0].length -1;

        for(int i=0 ; i<n && j>=0;i++ , j--){
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