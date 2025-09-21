/*class Solution {
    private int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row=heights.length,col=heights[0].length;
        boolean[][] pac=new boolean[row][col];
        boolean[][] alt=new boolean[row][col];

        Queue<int[]> pacq=new LinkedList<>();
        Queue<int[]> altq=new LinkedList<>();

        for(int c=0;c<col;c++){
            pacq.add(new int[]{0,c});
            altq.add(new int[]{row-1,c});
        }
        for( int r=0;r<row;r++){
            pacq.add(new int[]{r,0});
            altq.add(new int[]{r,col-1});
        }
        bfs(pacq,pac,heights);
        bfs(altq,alt,heights);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(pac[i][j] && alt[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    private void bfs(Queue<int[]> q, boolean[][] ocean, int[][] heights){
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            ocean[r][c]=true;
            for(int[] dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nc>=0 && nr<heights.length && nc<heights[0].length && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c] ){
                    q.offer(new int[]{nr,nc});
                }
            }
        }

    }
}*/
public class Solution {
    private int[][] directions = {{1, 0}, {-1, 0},
                                  {0, 1}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS = heights.length, COLS = heights[0].length;
        boolean[][] pac = new boolean[ROWS][COLS];
        boolean[][] atl = new boolean[ROWS][COLS];

        for (int c = 0; c < COLS; c++) {
            dfs(0, c, pac, heights);
            dfs(ROWS - 1, c, atl, heights);
        }
        for (int r = 0; r < ROWS; r++) {
            dfs(r, 0, pac, heights);
            dfs(r, COLS - 1, atl, heights);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (pac[r][c] && atl[r][c]) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }
        return res;
    }

    private void dfs(int r, int c, boolean[][] ocean, int[][] heights) {
        ocean[r][c] = true;
        for (int[] d : directions) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < heights.length &&
                nc >= 0 && nc < heights[0].length &&
                !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, ocean, heights);
            }
        }
    }
}