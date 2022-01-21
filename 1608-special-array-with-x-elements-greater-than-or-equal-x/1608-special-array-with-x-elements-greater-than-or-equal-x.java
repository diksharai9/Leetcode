class Solution {
    public int specialArray(int[] nums) {
        int count=0 ; 
        for(int i = 0 ; i<= 100 ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(i <= nums[j]){   
                    count++;
                }
            }
            if(count == i) { 
                return i;
            }
            count = 0 ;
        }
        return -1;
    }
}