class Solution {
    public boolean isPossible(int[] nums) {
         int n = nums.length;
		//Here we will be creating two hashmap one will be fm(frequency map) which will store the frequency of the elements present in the nums array
        HashMap<Integer,Integer> fm = new HashMap<>();
		
		//second map will be hm (hypothetical map) which will contain at what positions the insertion of elements is possible
		//for example if we have already gone throught 1,2,3 then it will create a entry in the hm map as  4,1 which means that at position 4   we can insert a value  and if there will be a 4 in the future
        HashMap<Integer,Integer> hm = new HashMap<>();
        
		//filling up the fm map
        for(int i=0;i<n;i++){
            fm.put(nums[i],fm.getOrDefault(nums[i],0)+1);
        }
        //traversing for all the elements 
        for(int i : nums){
		//we will not consider the element if it was already processed , that's why its frequency is 0
            if(fm.get(i)==0){
                continue;
            }
			//here we are checking for if the  element we are is there in the hypothetical map if there we will decement that value of the hm and add a new positon with i+1 in the hm and decrement the frequecy map of i
            else if(hm.getOrDefault(i,0)>0){
                hm.put(i,hm.get(i)-1);
                hm.put(i+1,hm.getOrDefault(i+1,0)+1);
                fm.put(i,fm.get(i)-1);
            }
			// this is where we will processes the three elemets for ex: if we will have i=1 then it will check for frequency of i=1,i=2,i=3 and decrement its value from the frequency map and insert a new positon i+3 at the hypothetical map
			//if we were said to make changes from 3 elements array to 4 we would have added one more element here of i+3 here only
            else if(fm.getOrDefault(i,0)>0 && fm.getOrDefault(i+1,0)>0 && fm.getOrDefault(i+2,0)>0){
                fm.put(i,fm.getOrDefault(i,0)-1);
                fm.put(i+1,fm.getOrDefault(i+1,0)-1);
                fm.put(i+2,fm.getOrDefault(i+2,0)-1);
                hm.put(i+3,hm.getOrDefault(i+3,0)+1);
            }
			//if none of the conditions fullfill that means we cannot store that particualar element in the array 
			// for ex in array 1,2,3,7 it will error out
            else{
                return false;
            }
        }
        return true;
    }
}