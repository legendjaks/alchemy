package com.sathy.alchemy.ll;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

  @Test
  public void testEven() {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(3);
    Node n5 = new Node(2);
    Node n6 = new Node(1);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;

    assertEquals(true, Palindrome.isPalindrome(n1));
  }

  @Test
  public void testOdd() {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(4);
    Node n7 = new Node(3);
    Node n8 = new Node(2);
    Node n9 = new Node(1);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n8;
    n8.next = n9;

    assertEquals(true, Palindrome.isPalindrome(n1));
  }

  @Test
  public void testFailure() {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(4);
    Node n7 = new Node(2);
    Node n8 = new Node(2);
    Node n9 = new Node(1);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n8;
    n8.next = n9;

    assertEquals(false, Palindrome.isPalindrome(n1));
  }
}
