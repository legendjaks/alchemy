package com.sathy.alchemy.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonSubstringTest {

  @Test
  public void test(){
    assertEquals(3, LongestCommonSubstring.find("banan".toCharArray(), "nanab".toCharArray()));
    assertEquals(3, LongestCommonSubstring.find("nanab".toCharArray(), "banan".toCharArray()));
    assertEquals(1, LongestCommonSubstring.find("test".toCharArray(), "tset".toCharArray()));
    assertEquals(4, LongestCommonSubstring.find("gamestester".toCharArray(), "tesotestingo".toCharArray()));
  }
}
