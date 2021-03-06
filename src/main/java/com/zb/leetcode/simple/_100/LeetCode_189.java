package com.zb.leetcode.simple._100;

/**
 * 189.旋转数组
 * @author Zhang Bo
 * @date 2019/12/5 17:26
 */
public class LeetCode_189 {

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     * 示例 2:
     * <p>
     * 输入: [-1,-100,3,99] 和 k = 2
     * 输出: [3,99,-1,-100]
     * 解释:
     * 向右旋转 1 步: [99,-1,-100,3]
     * 向右旋转 2 步: [3,99,-1,-100]
     * <p>
     * 来源：力扣（LeetCode_148）
     * 链接：https://leetcode-cn.com/problems/rotate-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        LeetCode_189 leetCode_189 = new LeetCode_189();
        int[] nums = {1,2,3,4,5,6,7};
        leetCode_189.rotate(nums,3);
        System.out.println(nums);
    }

    public void rotate(int[] nums, int k) {
        //计算真正移动次数
        k = k % nums.length;
        //反转三次
        //前半段
        reverse(nums, 0, nums.length - k - 1);
        //后半段
        reverse(nums, nums.length - k, nums.length - 1);
        //整体
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        int n = end - start + 1;
        for (int i = 0; i < n / 2; i++) {
            nums[i + start] ^= nums[end - i];
            nums[end - i] ^= nums[i + start];
            nums[i + start] ^= nums[end - i];
        }
    }
}
