class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
         vector<int> res;
        for (int i=0; i<nums1.size(); i++)
        {
            for (int j=0; j<nums2.size(); j++)
            {
                if (nums1[i]==nums2[j])
                {
                    int k;
                    for (k=j+1; k<nums2.size(); k++)
                    {
                        if (nums2[k]>nums2[j])
                        {
                            res.push_back(nums2[k]);
                            break;
                        }                            
                    }
                    if (k==nums2.size())
                        res.push_back(-1);
                    break;
                }
            }
        }
        
        return res;
        
    }
};