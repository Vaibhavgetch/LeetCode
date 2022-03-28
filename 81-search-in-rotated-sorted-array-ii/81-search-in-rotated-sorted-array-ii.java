class Solution {
      public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;
            if (nums[high] == nums[low]) low++;
                // if left side is sorted
            else if (nums[mid] > nums[low] || nums[mid] > nums[high]) {
                if (target < nums[mid] && target >= nums[low]) high = mid - 1;
                else low = mid + 1;
            } else {
                // right side is sorted
                if (target > nums[mid] && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;
    }
}