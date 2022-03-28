class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            if(!ans.contains(nums[i]))
            {
                int count = 1;
                for(int j=i+1; j<n; j++)
                {
                    if(nums[j]==nums[i])
						count++;
                }
                if(count>n/3)
					ans.add(nums[i]);
            }
        }
        return ans;
    }
}