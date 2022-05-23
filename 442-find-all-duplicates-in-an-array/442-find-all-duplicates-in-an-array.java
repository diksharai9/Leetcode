class Solution {
public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    Map<Integer,Integer> map= new HashMap<>();
    //iterate over the array and check if it is already in the map or not
    //if it contains then increase its frequency by one
    for(int i:nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }//else just add it to the map
        else{
            map.put(i,1);
        }
    }
    //now iterate over the map and check if frequency of the element is greater than 1 then add it to the arraylist
    for(Integer k:map.keySet()){
        if(map.get(k)>1){
            ans.add(k);
        }
    }
    return ans;
}
}