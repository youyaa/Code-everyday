package exercise.t0408;

/**
 * Author: listeningrain
 * Date: 2021/4/7 下午10:23
 * Description:  判断链表是否有环（快慢指针）
 */
public class LinkedListHasCircle {
    //方法一：hash存储法

    //方法二：快慢指针
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(null == head || head.next == null){
            return false;
        }

        while (fast != null){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else {
                fast = null;
            }
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
