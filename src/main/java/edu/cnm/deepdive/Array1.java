package edu.cnm.deepdive;

public class Array1 {

  public boolean firstLast6(int[] nums) {
    boolean result = false;
    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
      result = true;
    }
    return result;
  }
}
