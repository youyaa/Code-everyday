package exercise.t0408;

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

  //Definition for singly-linked list.
  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
