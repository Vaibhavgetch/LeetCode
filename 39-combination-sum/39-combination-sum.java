class Solution {
    List<List<Integer>> ans ;
    
    public void helper(int idx, int target, int[] arr, List<Integer> curr ){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
            }
            return ;
        }
        
        if(arr[idx] <= target){
            curr.add(arr[idx]);
            helper(idx, target - arr[idx], arr, curr);
            curr.remove(curr.size() - 1);
        }
        helper(idx + 1, target, arr, curr);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>() ;
        
        helper(0,target,candidates,new ArrayList<>());
        return ans ;
    }
}