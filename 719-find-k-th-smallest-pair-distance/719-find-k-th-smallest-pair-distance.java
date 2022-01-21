class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length-1] - nums[0];
        while(left < right){
            int mid = left + (right - left) / 2;
            if (isSmall(nums, k, mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    
    public boolean isSmall(int[] nums, int k, int mid){
        int count = 0;
        int left = 0;
        for (int i = 1;i < nums.length;i++){
            while(nums[i] - nums[left] > mid) left++;
            count+=i-left;
        }
        return count >=k;
    }
}