package edu.cnm.deepdive;

public class Array1 {

  /**
   * Given an array of ints, return true if 6 appears as either the first or last element in the
   * array. The array will be length 1 or more.
   *
   * firstLast6([1, 2, 6]) → true
   * firstLast6([6, 1, 2, 3]) → true
   * firstLast6([13, 6, 1, 2, 3]) → false
   * @param nums An int[]
   * @return boolean whether 6 appears as first or last elements
   */
  public boolean firstLast6(int[] nums) {
    boolean result = false;
    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
      result = true;
    }
    return result;
  }

  /**
   * Given an array of ints, return true if the array is length 1 or more, and the first element
   * and the last element are equal.
   *
   *
   * sameFirstLast([1, 2, 3]) → false
   * sameFirstLast([1, 2, 3, 1]) → true
   * sameFirstLast([1, 2, 1]) → true
   * @param nums An int[]
   * @return boolean whether first and last elements are the same
   */
  public boolean sameFirstLast(int[] nums) {
    return (nums.length >= 1) && (nums[0] == nums[nums.length - 1]);
  }

  /**
   * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
   *
   * makePi() → [3, 1, 4]
   * @return [3, 1, 4]
   */
  public int[] makePi() {
    return new int[]{3, 1, 4};
  }

  /**
   * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
   *
   * commonEnd([1, 2, 3], [7, 3]) → true
   * commonEnd([1, 2, 3], [7, 3, 2]) → false
   * commonEnd([1, 2, 3], [1, 3]) → true
   * @param a An int array
   * @param b An int array
   * @return boolean whether they have same first or last elements
   */
  public boolean commonEnd(int[] a, int[] b) {
    return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
  }

  /**
   * Given an array of ints length 3, return the sum of all the elements.
   *
   * sum3([1, 2, 3]) → 6
   * sum3([5, 11, 2]) → 18
   * sum3([7, 0, 0]) → 7
   * @param nums an array of 3 ints
   * @return sum of the ints
   */
  public int sum3(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }
}
