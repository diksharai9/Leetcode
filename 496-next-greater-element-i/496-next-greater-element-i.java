class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] res=new int[nums1.length];
        int z=0;
        for (int i=0; i<nums1.length; i++)
        {
            for (int j=0; j<nums2.length; j++)
            {
                if (nums1[i]==nums2[j])
                {
                    int k;
                    for (k=j+1; k<nums2.length; k++)
                    {
                        if (nums2[k]>nums2[j])
                        {
                            res[z]=nums2[k];
                           z++;
                            break;
                        }                            
                    }
                    if (k==nums2.length){
                        res[z]=-1;
                        z++;
                    }
                        
                    break;
                }
            }
        }
        
        return res;
    }
}