class Solution {
    
    public void gameOfLife(int[][] board) {
        
        int m = board.length ;
        int n = board[0].length;
        int[][] tempBoard = new int[m][n];
        
        
        for(int r = 0 ; r < m ; r++){
            for(int c = 0 ; c < n ; c++){
                 int liveNeighbors = neighbor(board, r-1, c-1) + neighbor(board, r-1, c) 
                                   + neighbor(board, r-1, c+1) + neighbor(board, r, c+1) 
                                   + neighbor(board, r+1, c+1) + neighbor(board, r+1, c) 
                                   + neighbor(board, r+1, c-1) + neighbor(board, r, c-1);
            
                if(board[r][c] == 1){ 
                    tempBoard[r][c] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;
                }else{ 
                    tempBoard[r][c] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
            
            }
          for(int r = 0; r < m; r++){
                board[r] = tempBoard[r].clone();    
        }
    }
        
    private int neighbor(int[][] board, int r , int c){
    
        
        if( r < 0 || r >= board.length 
           || c < 0 || c >= board[0].length 
           || board[r][c] == 0 ){
            return 0; 
        }                          
        return 1;
    }
    
    
}