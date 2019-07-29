
public class LinkedListLength {
  // Find length of linked list using iterative method
  public class Node{
    public int val;
    public Node next;
  }
  public int lengthOfLinkedList(Node head) {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;
  }
  // Find the length of Linked list using recursion
  public int lengthOfLinkedListRec(Node head)
  {
    Node temp=head;
    if(temp==null)
    {
      return 0;
    }
    else
    {
      return 1+ lengthOfLinkedListRec(temp.next);
    }
  }
}
