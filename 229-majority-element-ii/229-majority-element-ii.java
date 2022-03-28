class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            count=1;
            if(!list.contains(nums[i])){
                for(int j=i+1;j<n;j++){
                    if(nums[i]==nums[j])
                        count++;
                }
                if(count>n/3)
                    list.add(nums[i]);
                    
                
            }
        }
        return list;
    }
}