package com.zb.leetcode.array.simple;

/**
 * @author Zhang Bo
 * @date 2019/12/20 17:14
 */
public class Array_674 {
    /**
     * 给定一个未经排序的整数数组，找到最长且连续的的递增序列。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,3,5,4,7]
     * 输出: 3
     * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
     * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
     * 示例 2:
     * <p>
     * 输入: [2,2,2,2,2]
     * 输出: 1
     * 解释: 最长连续递增序列是 [2], 长度为1。
     * 注意：数组长度不会超过10000。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        Array_674 array_674 = new Array_674();
        System.out.println(array_674.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(array_674.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    public int findLengthOfLCIS(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (i != nums.length - 1 && nums[i] >= nums[i + 1]) {
                maxCount = count > maxCount ? count : maxCount;
                count = 0;
            }
        }
        maxCount = count > maxCount ? count : maxCount;
        return maxCount;
    }
}
