package exercise.t0412;

import exercise.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: listeningrain
 * Date: 2021/4/12 下午8:41
 * Description: 链表找环入口
 */
public class LinkedListFindCircleFirst {

    /**
     * set法
     */
    public ListNode detectCycle2(ListNode head) {
        Set<ListNode> set = new HashSet();
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }

    /**
     * 为了找到环所在的位置，在快慢指针相遇的时候，此时慢指针没有遍历完链表，
     * 再设置一个指针从链表头部开始遍历，这两个指针相遇的点，就是链表环的入口。
     */
    public ListNode detectCycle(ListNode head) {
        if(null == head || null == head.next){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null){
            if(fast.next != null){
                fast = fast.next.next;
            }else {
                fast = null;
            }
            slow = slow.next;
            if(fast == slow){
                //从头开始遍历
                ListNode newSlow = head;
                while (newSlow != null){
                    newSlow = newSlow.next;
                    slow = slow.next;
                    if(slow == newSlow){
                        return slow;
                    }
                }
            }
        }
        return null;
    }

}
