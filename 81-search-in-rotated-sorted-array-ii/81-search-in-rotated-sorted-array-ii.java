class Solution {
    public boolean search(int[] nums, int target) {
       int len = nums.length;
        if(len == 1){
            return nums[0] == target;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] == nums[mid] && nums[right] == nums[mid]){
                left ++;
                right --;
            }
            
            // left is sorted
            else if(nums[left] <= nums[mid]){
                // target is in left
                if(nums[mid] > target && target >= nums[left]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            
            // right is sorted
            else {
                // target is in right
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        
        return false;
        
    }
}