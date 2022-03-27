class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rows = new int[mat.length][2];
        
        for(int i = 0; i < mat.length; i++) {
            int count = 0;
            
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            
            rows[i][0] = count;
            rows[i][1] = i;
        }
        
        Arrays.sort(rows, (a, b) -> {
            return a[0] - b[0];
        });
        
        int[] ans = new int[k];
        
        for(int i = 0; i < k; i++) {
            ans[i] = rows[i][1];
        }
        
        return ans;
    }
}