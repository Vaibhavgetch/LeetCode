class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int low = 0 ;
        int r = matrix.length ;
        int c = matrix[0].length ;
        int high = r * c - 1 ;
        
        
        while( low <= high){
            
            int midcell = low + (high - low)/2 ;
            int midRow = midcell/ c ;
            int midCol = midcell % c ;
            
            
            
            if(matrix[midRow][midCol] == target) return true ;
            
            if(matrix[midRow][midCol] > target){
                high = midcell - 1 ;
            }
            else{low = midcell + 1;}
        }
        
        return false ;
    }
}