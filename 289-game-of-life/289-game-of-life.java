class Solution {
    public void gameOfLife(int[][] board) {
        int m  = board.length, n=board[0].length;
        int[][] fin = new int[m][n];
        for(int i=0; i<m; i++) {
            
            for(int j=0; j<n; j++) {
                int nbr = 0;
                
                if((i-1>=0) && board[i-1][j]==1) nbr++; 
                if((i+1<m) && board[i+1][j]==1) nbr++;
                if((j-1>=0) && board[i][j-1]==1) nbr++;
                if((j+1<n) && board[i][j+1]==1) nbr++;
                if((i-1>=0) && (j-1>=0) && board[i-1][j-1]==1) nbr++;
                if((i+1<m) && (j+1<n) && board[i+1][j+1]==1) nbr++;
                if((i-1>=0) && (j+1<n) && board[i-1][j+1]==1) nbr++;
                if((i+1<m) && (j-1>=0) && board[i+1][j-1]==1) nbr++;
                
                if(nbr<2) fin[i][j]=0;
                else if(nbr>3) fin[i][j]=0;
                else if((nbr!=3) && board[i][j]==0) fin[i][j]=0;
                else fin[i][j]=1;
            }
            
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = fin[i][j];
            }
        }
        
    }
}