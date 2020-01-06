package com.zb.leetcode.array.simple.a03;

/**
 * 将数组分成和相等的三个部分
 *
 * @author Zhang Bo
 * @date 2020/1/3 18:12
 */
public class Array_1013 {

    /**
     * 给定一个整数数组 A，只有我们可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
     * <p>
     * 形式上，如果我们可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输出：[0,2,1,-6,6,-7,9,1,2,0,1]
     * 输出：true
     * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
     * 示例 2：
     * <p>
     * 输入：[0,2,1,-6,6,7,9,-1,2,0,1]
     * 输出：false
     * 示例 3：
     * <p>
     * 输入：[3,3,6,5,-2,2,5,1,-9,4]
     * 输出：true
     * 解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
     *  
     * <p>
     * 提示：
     * <p>
     * 3 <= A.length <= 50000
     * -10000 <= A[i] <= 10000
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        Array_1013 array_1013 = new Array_1013();
        System.out.println(array_1013.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        System.out.println(array_1013.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        System.out.println(array_1013.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
        System.out.println(array_1013.canThreePartsEqualSum(new int[]{14,6,-10,2,18,-7,-4,11}));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int targetNum = sum / 3;
        int i = 0;
        int j = A.length - 1;
        int tmpA = 0;
        int tmpB = 0;
        while (i < j - 1) {
            int tmp = 0;
            while (tmpA != targetNum && i < j - 1) {
                tmpA += A[i++];
            }
            while (tmpB != targetNum && i < j) {
                tmpB += A[j--];
            }
            for (int k = i; k <= j; k++) {
                tmp += A[k];
            }
            if (tmp == targetNum) {
                return true;
            }
            tmpA += A[i++];
            tmpB += A[j--];
        }

        return false;
    }
}
