package com.sathy.alchemy.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumCoinsTest {
  
  @Test
  public void test() {
    
    int[] denom = {2, 5, 10};
    
    assertEquals(1, MinimumCoins.find(10, denom));
    assertEquals(2, MinimumCoins.find(15, denom));
    assertEquals(3, MinimumCoins.find(17, denom));
    assertEquals(0, MinimumCoins.find(3, denom));
  }
}
