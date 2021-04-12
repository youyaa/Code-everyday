package exercise.t0412;

import exercise.common.ListNode;

/**
 * Author: listeningrain
 * Date: 2021/4/12 下午8:57
 * Description: 找链表的中间节点
 */
public class LinkedListFindMiddleNode {

    /**
     * 快慢指针，当快指针到末尾时，慢指针刚好在中点
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (true){
            if(fast.next == null){
                return slow;
            }
            if(fast.next.next == null){
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }
}
