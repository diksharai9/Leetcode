class Solution {
    public void reverseString(char[] s) {
        char temp=0;
        int  i=0,j=s.length-1;
        
        while(i<=j){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
            
        }
            
        }
        
    }
