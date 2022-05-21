class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer,Integer> nm=new HashMap<>();
        int c=0,p=nums.length,s=0;
        nm.put(s,1);
        for(int i=0;i<p;i++)
        {
            s=s+nums[i];
            s%=k;
            if(s<0) // for case any negative number % k we want positive part (-1%5=4) 
                s+=k;
            if(nm.containsKey(s))
                c+=nm.get(s);
            nm.put(s, nm.getOrDefault(s,0)+1);
        }
        return c;
    }
}