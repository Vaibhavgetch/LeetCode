class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums, 0, nums.length -1, target);
    }
    
    private int binarySearch(int[] arr, int low, int high, int target){
        
        if(low > high)return -1 ;
        int mid = low + (high - low)/2;
        
        if(arr[mid] == target) return mid ;
        if(arr[mid] < target) return binarySearch(arr, mid+1, high, target);
         return binarySearch(arr, 0, mid-1, target);
        
    }
}