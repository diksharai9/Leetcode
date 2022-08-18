class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)map.put(num,map.getOrDefault(num,0)+1);
        int nums[]=new int[map.size()];
        int ix=0,ans=0,sum=0;
        for(int num:map.keySet()){
            nums[ix++]=map.get(num);
        }
        Arrays.sort(nums);
        ix=nums.length-1;
        while(sum< arr.length/2){
            sum+=nums[ix--];
            ans++;
        }
        return ans;
        
    }
}