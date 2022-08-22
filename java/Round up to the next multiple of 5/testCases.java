package com.codewars.hwtdstrngls;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class RoundToTheNextMultipleOf5Test {

  @Test
  public void basicTests() {
    int[][] arr = {
      {0, 0},
      {1, 5},
      {-1, 0},
      {-5, -5},
      {3, 5},
      {5, 5},
      {7, 10},
      {20, 20},
      {39, 40},
      {990, 990},
      {121, 125},
      {555, 555}
    };
    Arrays.stream(arr)
        .forEach(
            (testCase) -> {
              assertEquals(
                  "Input: " + testCase[0],
                  testCase[1],
                  RoundToTheNextMultipleOf5.roundToNext5(testCase[0]));
            });
  }

  @Test
  public void randomTests() {
    for (int t = 0; t < 50; t++) {
      int exp = (int) ((Math.random() * 1.0e6) - 5.0e5) * 5;
      int inp = exp - (int) (Math.random() * 4);
      // System.out.println("...should work for " + inp);
      assertEquals("Input: " + inp, exp, RoundToTheNextMultipleOf5.roundToNext5(inp));
    }
  }
}