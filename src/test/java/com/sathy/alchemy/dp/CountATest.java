package com.sathy.alchemy.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

  @Test
  public void test() {
    assertEquals(16, CountA.count(9));
    assertEquals(27, CountA.count(11));
  }

}
