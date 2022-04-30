class Solution{
     String longestPalindrome(String s) {
        String result = "";
        int maxLengthOfSubstring = 0;
        for (int index = 0; index < s.length(); index++) {
            //for the case where the palindrome substring is of odd length //"racecar" "e" will be in the central position so left and right pointers can point to it together.
            //in odd length palindromic substring , one can expand from centre and both left and right                  pointers
            //will be at a central index initially because mid of odd will always be available.
            int left = index;
            int right = index;
            while ((left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))) {
                if (maxLengthOfSubstring < right-left+1) {
                    result= s.substring(left,right+1);
                    maxLengthOfSubstring = right-left+1;
                }
                left--;
                right++;
            }

            //for the case where the palindrome substring is of even length //"abab"  "ba" will be the two characters in the centre , so left pointer will be at "b" and right will be at "a". 
            //in even length palindromic substring , there will be no centre so just need left and right to  be
            //next to each other and then repeat the expanding process.
            left = index;
            right = index + 1;
            while ((left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))) {
                if (maxLengthOfSubstring < right-left+1) {
                    result= s.substring(left,right+1);
                    maxLengthOfSubstring = right-left+1;
                }
                left--;
                right++; //expanding the two pointers.
            }


        }
        return result;
    }
}
