package com.sathy.alchemy.ll;

public class ListUtils {

  public static void print(Node head){
    
    while(head != null){
      System.out.print(head.data + " -> ");
      head = head.next;
    }
    System.out.println();
  }
}
