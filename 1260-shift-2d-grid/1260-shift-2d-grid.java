class Solution {
     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
      int n = grid.length, m = grid[0].length;  
      int arr[] = new int[n*m]; 
        
      int ind = 0;
      for(int i=0; i<n; i++){
          for(int j=0; j<m; j++)
              arr[ind++] = grid[i][j];
      }
      
      k = k%(m*n);
      int left = n*m-k-1, right = n*m-k;
      reverse(0, left, arr);
      reverse(right, n*m-1, arr);
      reverse(0, n*m-1, arr);
        
      List<List<Integer>> ans = new ArrayList<>();
      for(int i=0; i<n; i++){
         List<Integer> temp = new ArrayList<>();
         for(int j=i*m; j<(i+1)*m; j++)
             temp.add(arr[j]);
         
         ans.add(temp);
       }
        
       return ans;
    }
    
    void reverse(int s, int e, int arr[]){
       int mid = (s+e)/2; 
       for(int i=s, j=e; i<=mid && j>=mid; i++,j--){
          int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
    }
}