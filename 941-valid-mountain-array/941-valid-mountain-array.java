class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int i = 0;
        int N = arr.length - 1;
        while(i + 1 < arr.length - 1 && arr[i] < arr[i + 1]) i++;
        while(N - 1 > 0 && arr[N] < arr[N - 1]) N--;
        return i == N;
        
       
    }
}