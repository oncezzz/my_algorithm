package com.zb.leetcode.simple._600;

/***
 *
 * @author once
 * @date 2019/12/15 14:11
 *
 */
public class LeetCode_605 {

    /**
     * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     * <p>
     * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
     * <p>
     * 示例 1:
     * <p>
     * 输入: flowerbed = [1,0,0,0,1], n = 1
     * 输出: True
     * 示例 2:
     * <p>
     * 输入: flowerbed = [1,0,0,0,1], n = 2
     * 输出: False
     * <p>
     * 来源：力扣（LeetCode_148）
     * 链接：https://leetcode-cn.com/problems/can-place-flowers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        LeetCode_605 leetCode_605 = new LeetCode_605();
        System.out.println(leetCode_605.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(leetCode_605.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        System.out.println(leetCode_605.canPlaceFlowers(new int[]{1,0,0,0,0,1,0,0}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                count++;
                flowerbed[i] = 1;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        return count >= n;
    }
}
