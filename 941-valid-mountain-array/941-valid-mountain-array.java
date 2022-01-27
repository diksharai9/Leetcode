class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int i=0;
        int length=arr.length-1;
        while(i+1<arr.length-1 && arr[i]<arr[i+1])
            i++;
        while(length-1>0 && arr[length]<arr[length-1])
            length--;
        return i==length;
       
    }
}