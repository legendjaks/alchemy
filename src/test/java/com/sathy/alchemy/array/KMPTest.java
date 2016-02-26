package com.sathy.alchemy.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class KMPTest {

  @Test
  public void testPrecompute() {
    int[] pi = KMP.precompute("ababab".toCharArray());
    print(pi);
    
    pi = KMP.precompute("bbaaaaa".toCharArray());
    print(pi);
  }
  
  @Test
  public void testMatch() {
    assertEquals(true, KMP.match("abcdabababdc".toCharArray(), "ababab".toCharArray()));
    assertEquals(false, KMP.match("abcdabababdc".toCharArray(), "abababe".toCharArray()));
    assertEquals(true, KMP.match("abcdabababdc".toCharArray(), "abababd".toCharArray()));
    assertEquals(true, KMP.match("abcdbbaabbaaaad".toCharArray(), "bbaaaa".toCharArray()));
  }
  

  private void print(int[] pi) {
    for (int i : pi)
      System.out.print(i + " ");
    System.out.println();
  }
}
