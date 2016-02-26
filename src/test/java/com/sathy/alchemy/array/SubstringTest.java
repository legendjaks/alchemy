package com.sathy.alchemy.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstringTest {

  @Test
  public void testSubstring() {
    assertEquals(true, SubString.isSubstring("abcd", "bc"));
    assertEquals(false, SubString.isSubstring("abcd", "bca"));
    assertEquals(true, SubString.isSubstring("abbabacd", "aba"));
    assertEquals(true, SubString.isSubstring("abcabcabcd", "bcd"));
  }
}
