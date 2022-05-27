package com.cg.leetcode.medium.N5LongestPalindromicSubstring;

/**
 * 中心扩散法
 * TODO 算法复杂度是多少？为什么比前面的要快很多？
 */
public class Solution4 {
    public String longestPalindrome(String s) {
        char[] charArr = s.toCharArray();
        int len = s.length();
        int centerIndex = 0;
        int low = 0;
        int high = 0;
        int palindromLen = 1;
        for (int i = 0; i < len-1; i++) {
            int oddLen = expandAroundCenter(charArr, i, i);
            int evenLen = expandAroundCenter(charArr, i, i+1);
            int maxLen = Math.max(oddLen,evenLen);
            if (palindromLen < maxLen) {
                palindromLen = maxLen;
                low = i - (palindromLen-1)/2;
                high = i + palindromLen/2;
            }
        }
        return s.substring(low,high+1);
    }

    private int expandAroundCenter(char[] charArr, int i, int j) {
        int len = charArr.length;
        while (i>=0 && j <len) {
            if (charArr[i] != charArr[j]) {
                break;
            }
            i--;
            j++;
        }
        return j-i-1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution4().longestPalindrome("babad"));
    }

}
