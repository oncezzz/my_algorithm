package com.zb.leetcode.simple._100;

import com.zb.leetcode.ListNode;

/***
 *	141.环形链表
 * @author once
 * @date 2019/12/1 11:45
 *
 */
public class LeetCode_141 {

    /**
     * 给定一个链表，判断链表中是否有环。
     *
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：head = [3,2,0,-4], pos = 1
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第二个节点。
     *
     *
     * 示例 2：
     *
     * 输入：head = [1,2], pos = 0
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第一个节点。
     *
     *
     * 示例 3：
     *
     * 输入：head = [1], pos = -1
     * 输出：false
     * 解释：链表中没有环。
     *
     *
     * 来源：力扣（LeetCode_148）
     * 链接：https://leetcode-cn.com/problems/linked-list-cycle
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {

    }


    public boolean hasCycle(ListNode head) {
        //快慢指针
        ListNode shortNode = head;
        ListNode longNode = head;
        while (shortNode != null && longNode != null && longNode.next != null) {
            //如果存在环形节点,那么快慢指针始终会相遇
            longNode = longNode.next.next;
            if (shortNode == longNode) {
                return true;
            }
            shortNode = shortNode.next;

        }
        return false;
    }
}
