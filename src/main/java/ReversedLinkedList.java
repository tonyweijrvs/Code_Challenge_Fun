

/**
 * Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReversedLinkedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  public ListNode reverseList(ListNode head) {
    if (head==null){
      return null;
    }

    ListNode pre=null;
    ListNode cur=head;
    ListNode nxt=head.next;
    while(nxt!=null){
      cur.next=pre;
      pre=cur;
      cur=nxt;
      nxt=nxt.next;
    }
    cur.next=pre;
    return cur;
  }
}
