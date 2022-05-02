class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
           for(int j=nums.length-1;j>i;j--){
               if(nums[i]%2 != 0 && nums[j]%2 == 0){
                   temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
               }
               
           }
            }
            
        return nums;
       
        
    }
}