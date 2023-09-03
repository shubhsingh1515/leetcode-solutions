class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mat=new int[m+1][n+1];
        mat[0][1]=1;
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                mat[i][j]=mat[i-1][j]+mat[i][j-1];
            }
        }
        return mat[m][n];        
    }
}
