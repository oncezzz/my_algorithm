package com.zb.leetcode.medium._600;

/***
 * 647. 回文子串
 * @author once
 * @date 2020/12/7 21:02
 *
 */
public class LeetCode_647 {

    /**
     * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
     * <p>
     * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入："abc"
     * 输出：3
     * 解释：三个回文子串: "a", "b", "c"
     * 示例 2：
     * <p>
     * 输入："aaa"
     * 输出：6
     * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
     *  
     * <p>
     * 提示：
     * <p>
     * 输入的字符串长度不会超过 1000 。
     * <p>
     * 来源：力扣（LeetCode_148）
     * 链接：https://leetcode-cn.com/problems/palindromic-substrings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        LeetCode_647 leetCode_647 = new LeetCode_647();
        System.out.println(leetCode_647.countSubstrings("abc"));
        System.out.println(leetCode_647.countSubstrings("aaa"));
        System.out.println(leetCode_647.countSubstrings("abaaba"));
        System.out.println(leetCode_647.countSubstrings("aaaaa"));
        System.out.println(leetCode_647.countSubstrings("fdsklf"));
    }

    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (chars[i] == chars[j] && (i - j <= 2 || dp[i - 1][j +1])) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
