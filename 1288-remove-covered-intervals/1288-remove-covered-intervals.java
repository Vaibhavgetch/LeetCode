class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     int res  = 0 ;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2){
                return arr1[0] - arr2[0];       
            }
        });
        
        int left = -1, right = -1 ;
        for(int i = 0 ; i < intervals.length ; i++){
            if(intervals[i][0] > left &&  intervals[i][1] > right ){
                 left = intervals[i][0]; 
                res++;
            }
          
            right = Math.max(right,intervals[i][1]);//2
            
            
        }
        return res ;
    }
}