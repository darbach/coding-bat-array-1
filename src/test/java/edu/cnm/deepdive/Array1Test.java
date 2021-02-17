package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Array1Test {

  Array1 a1 = new Array1();

  @Test
  void firstLast6() {
    int[][] firstLast6Params = {
        {1, 2, 6},
        {6, 1, 2, 3},
        {13, 6, 1, 2, 3},
        {13, 6, 1, 2, 6},
        {3, 2, 1},
        {3, 6, 1},
        {3, 6},
        {6},
        {3},
        {5, 6},
        {5, 5},
        {1, 2, 3, 4, 6},
        {1, 2, 3, 4}
    };
    boolean[] firstLast6Expected = {
        true, true, false, true, false, false, true, true, false, true, false, true, false
    };
    for (int i = 0; i < firstLast6Params.length; i++) {
      String param = Arrays.toString(firstLast6Params[i]);
      boolean expected = firstLast6Expected[i];
      boolean actual = a1.firstLast6(firstLast6Params[i]);
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }
}