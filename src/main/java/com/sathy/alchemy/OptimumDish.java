package com.sathy.alchemy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class OptimumDish {
  
  private Set<Integer> result = new HashSet<Integer>();
  
  public void print(){
    for(int r:result)
      System.out.print(r + " ");
  }

  public void find(int[][] m, int r, int c, int mr, int mc, Stack<Integer> dishes) {

    dishes.push(c);
    
    if (r == mr) {
      Set<Integer> d = new HashSet<>(dishes);
      if(result.size() == 0 || result.size() > d.size())
        result = d;
    }
    else if (r < mr) {
      for (int i = 0; i <= mc; i++) {
        if (m[r + 1][i] == 1) {
          find(m, r+1, i, mr, mc, dishes);
          break;
        }
      }
    }

    dishes.pop();
    
    for (int i = c + 1; i <= mc; i++) {
      if (m[r][i] == 1) {
        find(m, r, i, mr, mc, dishes);
      }
    }
  }

  public static void main(String[] args) {

    int[][] m = { 
        { 0, 1, 1, 0, 0, 0, 0 },
        { 0, 1, 0, 1, 0, 0, 0 },
        { 0, 1, 1, 0, 0, 1, 0 },
        { 1, 0, 0, 1, 0, 0, 0 },
        { 0, 0, 1, 0, 1, 0, 0 },
        { 0, 0, 0, 1, 0, 0, 1 }
        };

    int mr = m.length - 1;
    int mc = m[0].length - 1;
    int c = 0;

    for (int i = 0; i <= mr; i++) {
      if (m[0][i] == 1) {
        c = i;
        break;
      }
    }

    OptimumDish od = new OptimumDish();
    Stack<Integer> dishes = new Stack<>();
    od.find(m, 0, c, mr, mc, dishes);
    od.print();
  }
}
