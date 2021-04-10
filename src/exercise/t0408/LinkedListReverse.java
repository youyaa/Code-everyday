package exercise.t0408;

import exercise.common.ListNode;

/**
 * Author: listeningrain
 * Date: 2021/4/7 下午10:23
 * Description:  链表翻转
 */
public class LinkedListReverse {

    public ListNode reverseList(ListNode head) {
        if(null == head){
            return head;
        }
        ListNode switchRightNode = head.next;
        ListNode switchLeftNode = head;

        head.next = null;

        while(switchRightNode != null){
            ListNode newHead = switchRightNode.next;
            switchRightNode.next = switchLeftNode;
            switchLeftNode = switchRightNode;
            switchRightNode = newHead;
        }
        return switchLeftNode;
    }
}
