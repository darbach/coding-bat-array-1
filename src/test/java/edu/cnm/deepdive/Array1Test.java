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
    System.out.println("Running firstLast6() test...");
    for (int i = 0; i < firstLast6Params.length; i++) {
      String param = Arrays.toString(firstLast6Params[i]);
      boolean expected = firstLast6Expected[i];
      boolean actual = a1.firstLast6(firstLast6Params[i]);
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void sameFirstLast() {
    int[][] sameFirstLastParams = {
        {1, 2, 3},
        {1, 2, 3, 1},
        {1, 2, 1},
        {7},
        {},
        {1, 2, 3, 4, 5, 1},
        {1, 2, 3, 4, 5, 13},
        {13, 2, 3, 4, 5, 13},
        {7, 7}
    };
    boolean[] sameFirstLastExpected = {
        false, true, true, true, false, true, false, true, true
    };
    System.out.println("Running sameFirstLast() test...");
    for (int i = 0; i < sameFirstLastParams.length; i++) {
      String param = Arrays.toString(sameFirstLastParams[i]);
      boolean expected = sameFirstLastExpected[i];
      boolean actual = a1.sameFirstLast(sameFirstLastParams[i]);
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void makePi() {
    String expected = Arrays.toString(new int[]{3, 1, 4});
    String actual = Arrays.toString(a1.makePi());
    System.out.println("Running makePi() test...");
    System.out
        .printf("Expected: %s; Actual: %s%n", expected, actual);
    assertEquals(expected, actual);
  }

  @Test
  void commonEnd() {
    int[][][] commonEndParams = {
        {{1, 2, 3}, {7, 3}},
        {{1, 2, 3}, {7, 3, 2}},
        {{1, 2, 3}, {1, 3}},
        {{1, 2, 3}, {1}},
        {{1, 2, 3}, {2}}
    };
    boolean[] commonEndExpected = {
        true, false, true, true, false
    };
    System.out.println("Running commonEnd() test...");
    for (int i = 0; i < commonEndParams.length; i++) {
      String param = Arrays.toString(commonEndParams[i][0]) + ", "
          + Arrays.toString(commonEndParams[i][1]);
      boolean expected = commonEndExpected[i];
      boolean actual = a1.commonEnd(commonEndParams[i][0], commonEndParams[i][1]);
      System.out.printf("Params: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void sum3() {
    int[][] sum3Params = {
        {1, 2, 3},
        {5, 11, 2},
        {7, 0, 0},
        {1, 2, 1},
        {1, 1, 1},
        {2, 7, 2}
    };
    int[] sum3Expected = {
        6, 18, 7, 4, 3, 11
    };
    System.out.println("Running sum3() test...");
    for (int i = 0; i < sum3Params.length; i++) {
      String param = Arrays.toString(sum3Params[i]);
      int expected = sum3Expected[i];
      int actual = a1.sum3(sum3Params[i]);
      System.out.printf("Params: %s; Expected: %d; Actual: %d%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void rotateLeft3() {
    int[][] rotateLeft3Params = {
        {1, 2, 3},
        {5, 11, 9},
        {7, 0, 0},
        {1, 2, 1},
        {0, 0, 1}
    };
    int[][] rotateLeft3Expected = {
        {2, 3, 1},
        {11, 9, 5},
        {0, 0, 7},
        {2, 1, 1},
        {0, 1, 0}
    };
    System.out.println("Running rotateLeft3() test...");
    for (int i = 0; i < rotateLeft3Params.length; i++) {
      String param = Arrays.toString(rotateLeft3Params[i]);
      String expected = Arrays.toString(rotateLeft3Expected[i]);
      String actual = Arrays.toString(a1.rotateLeft3(rotateLeft3Params[i]));
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void reverse3() {
    int[][] reverse3Params = {
        {1, 2, 3},
        {5, 11, 9},
        {7, 0, 0},
        {2, 1, 2},
        {1, 2, 1},
        {2, 11, 3},
        {0, 6, 5},
        {7, 2, 3}
    };
    int[][] reverse3Expected = {
        {3, 2, 1},
        {9, 11, 5},
        {0, 0, 7},
        {2, 1, 2},
        {1, 2, 1},
        {3, 11, 2},
        {5, 6, 0},
        {3, 2, 7}
    };
    System.out.println("Running reverse3() test...");
    for (int i = 0; i < reverse3Params.length; i++) {
      String param = Arrays.toString(reverse3Params[i]);
      String expected = Arrays.toString(reverse3Expected[i]);
      String actual = Arrays.toString(a1.reverse3(reverse3Params[i]));
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void maxEnd3() {
    int[][] maxEnd3Params = {
        {1, 2, 3},
        {11, 5, 9},
        {2, 11, 3},
        {11, 3, 3},
        {3, 11, 11},
        {2, 2, 2},
        {2, 11, 2},
        {0, 0, 1}
    };
    int[][] maxEnd3Expected = {
        {3, 3, 3},
        {11, 11, 11},
        {3, 3, 3},
        {11, 11, 11},
        {11, 11, 11},
        {2, 2, 2},
        {2, 2, 2},
        {1, 1, 1}
    };
    System.out.println("Running maxEnd3() test...");
    for (int i = 0; i < maxEnd3Params.length; i++) {
      String param = Arrays.toString(maxEnd3Params[i]);
      String expected = Arrays.toString(maxEnd3Expected[i]);
      String actual = Arrays.toString(a1.maxEnd3(maxEnd3Params[i]));
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void sum2() {
    int[][] sum2Params = {
        {1, 2, 3},
        {1, 1},
        {1, 1, 1, 1},
        {1, 2},
        {1},
        {},
        {4, 5, 6},
        {4}
    };
    int[] sum2Expected = {
        3, 2, 2, 3, 1, 0, 9, 4
    };
    System.out.println("Running sum2() test...");
    for (int i = 0; i < sum2Params.length; i++) {
      String param = Arrays.toString(sum2Params[i]);
      int expected = sum2Expected[i];
      int actual = a1.sum2(sum2Params[i]);
      System.out.printf("Param: %s; Expected: %d; Actual: %d%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void middleWay() {
    int[][][] middleWayParams = {
        {{1, 2, 3}, {4, 5, 6}},
        {{7, 7, 7}, {3, 8, 0}},
        {{5, 2, 9}, {1, 4, 5}},
        {{1, 9, 7}, {4, 8, 8}},
        {{1, 2, 3}, {3, 1, 4}},
        {{1, 2, 3}, {4, 1, 1}}
    };
    int[][] middleWayExpected = {
        {2, 5},
        {7, 8},
        {2, 4},
        {9, 8},
        {2, 1},
        {2, 1}
    };
    System.out.println("Running middleWay() test...");
    for (int i = 0; i < middleWayParams.length; i++) {
      String param =
          Arrays.toString(middleWayParams[i][0]) + ", " + Arrays.toString(middleWayParams[i][1]);
      String expected = Arrays.toString(middleWayExpected[i]);
      String actual = Arrays.toString(a1.middleWay(middleWayParams[i][0], middleWayParams[i][1]));
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void makeEnds() {
    int[][] makeEndsParams = {
        {1, 2, 3},
        {1, 2, 3, 4},
        {7, 4, 6, 2},
        {1, 2, 2, 2, 2, 2, 2, 3},
        {7, 4},
        {7},
        {5, 2, 9},
        {2, 3, 4, 1},
    };
    int[][] makeEndsExpected = {
        {1, 3},
        {1, 4},
        {7, 2},
        {1, 3},
        {7, 4},
        {7, 7},
        {5, 9},
        {2, 1}
    };
    System.out.println("Running MakeEnds() test...");
    for (int i = 0; i < makeEndsParams.length; i++) {
      String param = Arrays.toString(makeEndsParams[i]);
      String expected = Arrays.toString(makeEndsExpected[i]);
      String actual = Arrays.toString(a1.makeEnds(makeEndsParams[i]));
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void has23() {
    int[][] has23Params = {
        {2, 5},
        {4, 3},
        {4, 5},
        {2, 2},
        {3, 2},
        {3, 3},
        {7, 7},
        {3, 9},
        {9, 5}
    };
    boolean[] has23Expected = {
        true,
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false
    };
    System.out.println("Running has23() test...");
    for (int i = 0; i < has23Params.length; i++) {
      String param = Arrays.toString(has23Params[i]);
      boolean expected = has23Expected[i];
      boolean actual = a1.has23(has23Params[i]);
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void no23() {
    int[][] no23Params = {
        {4, 5},
        {4, 2},
        {3, 5},
        {1, 9},
        {2, 9},
        {1, 3},
        {1, 1},
        {2, 2},
        {3, 3},
        {7, 8},
        {8, 7}
    };
    boolean[] no23Expected = {
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true
    };
    System.out.println("Running no23() test...");
    for (int i = 0; i < no23Params.length; i++) {
      String param = Arrays.toString(no23Params[i]);
      boolean expected = no23Expected[i];
      boolean actual = a1.no23(no23Params[i]);
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void makeLast() {
    int[][] makeLastParams = {
        {4, 5, 6},
        {1, 2},
        {3},
        {0},
        {7, 7, 7},
        {3, 1, 4},
        {1, 2, 3, 4},
        {1, 2, 3, 0},
        {2, 4},
    };
    int[][] makeLastExpected = {
        {0, 0, 0, 0, 0, 6},
        {0, 0, 0, 2},
        {0, 3},
        {0, 0},
        {0, 0, 0, 0, 0, 7},
        {0, 0, 0, 0, 0, 4},
        {0, 0, 0, 0, 0, 0, 0, 4},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 4}
    };
    System.out.println("Running MakeLast() test...");
    for (int i = 0; i < makeLastParams.length; i++) {
      String param = Arrays.toString(makeLastParams[i]);
      String expected = Arrays.toString(makeLastExpected[i]);
      String actual = Arrays.toString(a1.makeLast(makeLastParams[i]));
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }

  @Test
  void double23() {
    int[][] double23Params = {
        {2, 2},
        {3, 3},
        {2, 3},
        {3, 2},
        {4, 5},
        {2},
        {3},
        {},
        {3, 4}
    };
    boolean[] double23Expected = {
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    };
    System.out.println("Running double23() test...");
    for (int i = 0; i < double23Params.length; i++) {
      String param = Arrays.toString(double23Params[i]);
      boolean expected = double23Expected[i];
      boolean actual = a1.double23(double23Params[i]);
      System.out.printf("Param: %s; Expected: %s; Actual: %s%n", param, expected, actual);
      assertEquals(expected, actual);
    }
  }
}