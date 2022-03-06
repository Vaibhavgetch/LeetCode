class TreeAncestor {
   
    static int[][] dp ;
    int maxJumps ;
    public TreeAncestor(int n, int[] parent) {
        maxJumps  = (int)(Math.log(n)/Math.log(2)) + 1 ;
        dp = new int[maxJumps][n];
    
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length; j++ ){
                if(i == 0){
                    dp[i][j] = parent[j];
                continue ;
                
                }
                
           int temp = dp[i - 1][j];
            dp[i][j] = temp == -1 ? -1 : dp[i-1][temp];
        }}
        
    }
    
    public int getKthAncestor(int node, int k) {
        int ans = -1 ;
        int i = maxJumps ;
        while(k > 0  && node  != -1){
            if( k >= (1 << i)){
                ans = dp[i][node];
                node = ans ;
                k -=( 1 << i);
            }
            else{
                i--;
            }
        }
        return ans ;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */