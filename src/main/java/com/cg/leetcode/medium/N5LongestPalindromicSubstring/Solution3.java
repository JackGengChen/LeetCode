package com.cg.leetcode.medium.N5LongestPalindromicSubstring;

public class Solution3 {
    public String longestPalindrome(String s) {
        int len = s.length();
        char[] charArr = s.toCharArray();
        /** 每一次i循环表示一个固定长度，从最长的长度开始，即s.len **/
        for (int i = 0; i < len; i++) {
            /** f从0开始到i，分别判断[f,len-i+f]是不是回文 **/
            for (int f = 0; f <= i; f++) {
                if (isPalindrome(charArr, f,len-i+f-1)) {
                    return s.substring(f,len-i+f);
                }
            }
        }
        return null;
    }

    public boolean isPalindrome(char[] s, int min,  int max){
        int len = max - min + 1;
        for (int i = 0; i < (len/2); i++ ){
            if (s[max-i] != s[min + i]){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().longestPalindrome("432423asdffdsa234234"));
    }
}
