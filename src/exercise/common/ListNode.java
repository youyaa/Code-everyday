package exercise.common;

/**
 * Definition for singly-linked list.
 * 单链表节点类定义
 */
public class ListNode {
    int val;
    public ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
