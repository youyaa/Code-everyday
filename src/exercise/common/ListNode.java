package exercise.common;

/**
 * Definition for singly-linked list.
 * 单链表节点类定义
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
