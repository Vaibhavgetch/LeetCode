class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int count = matrix.length * matrix[0].length ;
        
        List<Integer> list = new ArrayList<>() ;
        int fr = 0 ;
        int fc = 0 ;
        int lr = matrix.length - 1 ;
        int lc = matrix[0].length - 1 ;
            
        while(count != 0){
            
            //first row
            
            for(int i = fc ; i <= lc; i++){
                list.add(matrix[fr][i]);
                count--;                
            }
            fr++;
            // last col 
            if(count == 0) break ;
            
            for(int i = fr ; i <= lr; i++){
                list.add(matrix[i][lc]);
                count--;                    
            }
            lc-- ;
            if(count == 0) break ;
            // last row 
            for(int i = lc ; i >= fc; i--){
                list.add(matrix[lr][i]);
                count--;                
            }
            lr-- ;
            if(count == 0) break ;
            //first col 
            for(int i = lr ; i >= fr; i--){
                list.add(matrix[i][fc]);
                count--;                
            }
            fc++ ;
        }
            
        return list ;
    }
}