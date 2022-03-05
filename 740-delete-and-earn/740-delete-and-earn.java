class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE ;
        for(int val : nums){
            max = Math.max(max,val);          
        }
        
        int[] freq = new int[max + 1];
        
        for(int num : nums){
            freq[num] += num ;
        }
        
        int take = 0, skip = 0 ;
        
        for(int i = 0 ; i < max + 1 ; i++){
            int takeI = skip + freq[i];
            int skipI = Math.max(skip,take);
            take = takeI ;
            skip = skipI ;
        }
        return Math.max(take,skip);
    }
}