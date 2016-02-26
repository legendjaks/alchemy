package com.sathy.alchemy.ll;

public class Reverse {

  public static Node reverse(Node head){
    
    if(head == null)
      return null;
    
    Node current = head;
    Node next = current.next;
    head.next = null;
    
    while(next != null){
      Node temp = next.next;
      next.next = current;
      current = next;
      next = temp;
    }
    
    return current;
  }
  
  static class Info{
    Node head, tail, next;
    
    public Info(Node h, Node t, Node x){
      head = h;
      tail = t;
      next = x;
    }
  }
  
  // reverse helper
  // 1->2->3->4 , k = 3 returns
  // head = 3, tail = 1, next = 4 with 3->2->1->null
  private static Info helper(Node n, int k){
    
    Node temp, tail;
    Node current = n;
    Node next = current.next;
    current.next = null;
    
    tail = current;
    temp = null;
    int i = 1;
    
    while((i<k) && next!= null){
      temp = next.next;
      next.next = current;
      current = next;
      next = temp;
      i++;
    }
    
    return new Info(current, tail, temp);
  }
  
  // reverse K nodes
  public static Node reverseK2(Node n, int k){
    
    if(k==1)
      return n;
    
    Node head = null;
    Info prev = null;
    
    while(n != null){
      Info current = helper(n, k);
      
      // join prev segment and current segment
      if(prev == null)
        head = current.head;
      else
        prev.tail.next = current.head;
      
      n = current.next;
      prev = current;
    }
    
    return head;
  }
}
