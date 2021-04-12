package exercise.t0412;

import exercise.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: listeningrain
 * Date: 2021/4/12 下午8:41
 * Description: 两条链表找重合的节点
 */
public class LinkedListFindCircleCommon {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

}
