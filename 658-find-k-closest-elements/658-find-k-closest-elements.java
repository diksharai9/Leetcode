class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> lst = new ArrayList<>();
        
        int n = arr.length;
        
        //Current window size is n,we want to reduce it to k.
        int low = 0;
        int high = n - 1;
        
        //Till window size is not k
        while(high - low >= k){
            //if (x - arr[low]) > (x - arr[high]) means arr[high] is closest so we will eliminate arr[low].
            if(Math.abs(x - arr[low]) > Math.abs(x - arr[high])){
                low++;
            }
            //Vice versa of first case
            else{
                high--;
            }
        }
        
        for(int i = low; i <= high; i++){
            lst.add(arr[i]);
        }
        return lst;
    }
}