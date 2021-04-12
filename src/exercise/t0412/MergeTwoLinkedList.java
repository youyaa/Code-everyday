package exercise.t0412;

import exercise.common.ListNode;

/**
 * Author: listeningrain
 * Date: 2021/4/12 下午9:03
 * Description: 两个有序链表合并
 */
public class MergeTwoLinkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode();
        ListNode param = newHead;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                param.next = l1;
                l1 = l1.next;
                param = param.next;
            }else {
                param.next = l2;
                l2 = l2.next;
                param = param.next;
            }
        }
        if(l1 != null){
            param.next = l1;
        }
        if(l2 != null){
            param.next = l2;
        }
        return newHead.next;
    }
}
