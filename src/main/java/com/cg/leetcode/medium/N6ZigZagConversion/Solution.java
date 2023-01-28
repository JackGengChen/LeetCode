package com.cg.leetcode.medium.N6ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String convert(String s, int numRows) {
        boolean goingDown=false;
        StringBuilder sb = new StringBuilder();
        int curRow = 0;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        if (numRows == 1) {
            return s;
        }
        for(int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        for (int i=0; i<s.length(); i++) {
            rows.get(curRow).append(s.charAt(i));
            if (curRow == 0 || curRow == numRows-1) {
                goingDown = !goingDown;
            }
            if (goingDown) {
                curRow++;
            } else {
                curRow--;
            }

        }
        for (StringBuilder tmp : rows){
            sb.append(tmp);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().convert("AB",1));
    }
}
