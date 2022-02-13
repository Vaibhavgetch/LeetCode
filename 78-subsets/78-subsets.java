class Solution {
    List<List<Integer>> res ;
    
    public  void helper(List<Integer> temp, int idx, int[] nums){
        
        if(idx == nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }
        
        temp.add(nums[idx]);
        helper(temp,idx+1,nums);
        temp.remove(temp.size() - 1);
        helper(temp,idx+1,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>() ;
           helper(new ArrayList<>(),0,nums);
        return res ;
    }
}