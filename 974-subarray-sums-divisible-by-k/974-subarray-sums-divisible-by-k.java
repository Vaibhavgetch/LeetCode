class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     
        int result = 0 ;
        HashMap<Integer, Integer> hm = new HashMap<>() ;
        int cSum = 0 ;
        hm.put(0,1);
        for(int arr: nums){
            cSum+= arr ;
            int rem = cSum%k ;
            
            if(rem < 0){
                rem += k ;
            }
            if(hm.containsKey(rem)){
                result+= hm.get(rem);
                hm.put(rem,hm.get(rem) + 1);
            }
            else{
                hm.put(rem,1);
            }
            
        }
        return result;
        
        
        
    }
}