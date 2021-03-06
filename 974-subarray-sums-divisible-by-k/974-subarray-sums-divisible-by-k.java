class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0; 
        int count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        
        map.put(sum,1);
        for(int i = 0;i<nums.length;i++){
            sum = sum+=nums[i];
            int temp = sum%k;
            if(temp<0){
                temp+=k;
            }
            if(map.containsKey(temp)==true){
                int freq = map.get(temp);
                count = count+freq;    
               
                 map.put(temp,freq+1);
            }else{
                map.put(temp,1);

            }
            
        }
        return count;}
}