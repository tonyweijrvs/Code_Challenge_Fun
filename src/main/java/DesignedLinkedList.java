// Design a linkedlist
public class DesignedLinkedList {
  class MyLinkedList {

    private class Node{
      public int val ;
      public Node next;
      public Node(int val){
        this.val = val;
        this.next = null;
      }
    }
    public Node dummyHead;
    public int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
      dummyHead = new Node(0);
      size=0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
      System.out.println(size);
      if(index<0 || index>=size)
        return -1;

      Node cur = dummyHead.next;
      for(int i=0 ; i<index ; i++)
        cur= cur.next;
      return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
      Node cur = new Node(val);
      cur.next = dummyHead.next;
      dummyHead.next = cur;
      size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
      Node node = new Node(val);
      Node cur = dummyHead.next;

      for(int i=0 ; i<size-1; i++)
        cur = cur.next;

      cur.next = node;
      size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
      if(index<0 || index>size)
        return ;

      Node node = new Node(val);
      Node pre = dummyHead;
      for(int i=0 ;i<index; i++)
        pre=pre.next;

      node.next = pre.next;
      pre.next = node;
      size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
      if(index<0 || index>=size)
        return ;

      Node pre = dummyHead;
      for(int i=0  ;i<index ;i++)
        pre = pre.next;

      pre.next =  pre.next.next;
      size--;
    }

    public String toString(){

      StringBuilder res = new StringBuilder();

      Node cur = dummyHead.next;
      while(cur!=null){
        res.append(cur+"->");
        cur = cur.next;
      }
      res.append("Null");

      return res.toString();
    }
  }

}
