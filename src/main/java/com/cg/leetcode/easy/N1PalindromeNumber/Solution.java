package com.cg.leetcode.easy.N1PalindromeNumber;

/**
 * (int)(len/2) 直接写成 len/2就可以
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int len = a.length();
        for (int i = 0; i < (len/2); i++ ){
            if (a.charAt(len-1-i) != a.charAt(i)){
                return false;
            }
        }
        return  true;
    }

    public boolean isPalindrome2(int x) {
        /**
         * 如果没有这一段，12210会不通过
         */
        if (x<0 || x%10 ==0 && x != 0) {
            return false;
        }
        int revertedNum = 0;
        while (revertedNum < x) {
            revertedNum = x%10 + revertedNum*10;
            x /= 10;
        }
        return revertedNum == x || revertedNum/10 == x;
    }

    public static void main(String[] args) {
        new Solution().isPalindrome2(121);
    }

}
