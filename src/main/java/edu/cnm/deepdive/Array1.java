package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array1 {

  /**
   * Given an array of ints, return true if 6 appears as either the first or last element in the
   * array. The array will be length 1 or more.
   *
   * firstLast6([1, 2, 6]) → true
   * firstLast6([6, 1, 2, 3]) → true
   * firstLast6([13, 6, 1, 2, 3]) → false
   *
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
   *
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
   *
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
   *
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

  public int[] rotateLeft3(int[] nums) {
    int[] result = new int[nums.length];
    int numOfShifts = 2;
    for (int i = 0; i < nums.length; i++) {
      int newPosition = (i + numOfShifts) % nums.length;
      result[newPosition] = nums[i];
    }
    return result;
  }

  /**
   * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
   *
   * reverse3([1, 2, 3]) → [3, 2, 1]
   * reverse3([5, 11, 9]) → [9, 11, 5]
   * reverse3([7, 0, 0]) → [0, 0, 7]
   *
   * @param nums an array of 3 ints
   * @return reversed input
   */
  public int[] reverse3(int[] nums) {
    int[] result = new int[nums.length];
    int temp = nums[0];
    result[0] = nums[2];
    result[1] = nums[1];
    result[2] = temp;
    return result;
  }

  /**
   * Given an array of ints length 3, figure out which is larger, the first or last element in the
   * array, and set all the other elements to be that value. Return the changed array.
   *
   * maxEnd3([1, 2, 3]) → [3, 3, 3]
   * maxEnd3([11, 5, 9]) → [11, 11, 11]
   * maxEnd3([2, 11, 3]) → [3, 3, 3]
   *
   * @param nums An array of 3 ints.
   * @return An array filled with the larger value of the first or last element from the input.
   */
  public int[] maxEnd3(int[] nums) {
    int[] result = new int[nums.length];
    Arrays.fill(result, Math.max(nums[0], nums[nums.length - 1]));
    return result;
  }

  /**
   * Given an array of ints, return the sum of the first 2 elements in the array. If the array
   * length is less than 2, just sum up the elements that exist, returning 0 if the array is
   * length 0.
   *
   * sum2([1, 2, 3]) → 3
   * sum2([1, 1]) → 2
   * sum2([1, 1, 1, 1]) → 2
   *
   * @param nums An array of ints
   * @return Sum of first two elements
   */
  public int sum2(int[] nums) {
    int sum = 0;
    if (nums.length == 1) {
      sum = nums[0];
    } else if (nums.length > 1) {
      sum = nums[0] + nums[1];
    }
    return sum;
  }

  /**
   * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
   *
   * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
   * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
   * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
   *
   * @param a An array of 3 ints
   * @param b An array of 3 ints
   * @return An array containing the middle elements of a and b
   */
  public int[] middleWay(int[] a, int[] b) {
    return new int[] {a[1], b[1]};
  }

  /**
   * Given an array of ints, return a new array length 2 containing the first and last elements
   * from the original array. The original array will be length 1 or more.
   *
   * makeEnds([1, 2, 3]) → [1, 3]
   * makeEnds([1, 2, 3, 4]) → [1, 4]
   * makeEnds([7, 4, 6, 2]) → [7, 2]
   *
   * @param nums An array of length 1 or greater
   * @return A length 2 array with the first and last values from the input
   */
  public int[] makeEnds(int[] nums) {
    return new int[] {nums[0], nums[nums.length-1]};
  }

  /**
   * Given an int array length 2, return true if it contains a 2 or a 3.
   *
   * has23([2, 5]) → true
   * has23([4, 3]) → true
   * has23([4, 5]) → false
   *
   * @param nums An int array of length 2
   * @return Boolean whether the input contains a 2 or 3
   */
  public boolean has23(int[] nums) {
    return nums[0] == 2
        || nums[0] == 3
        || nums[1] == 2
        || nums[1] == 3;
  }

  /**
   * Given an int array length 2, return true if it does not contain a 2 or 3.
   *
   * no23([4, 5]) → true
   * no23([4, 2]) → false
   * no23([3, 5]) → false
   *
   * @param nums An int array of length 2
   * @return Boolean whether the input does not contain a 2 or 3
   */
  public boolean no23(int[] nums) {
    return nums[0] != 2
        && nums[0] != 3
        && nums[1] != 2
        && nums[1] != 3;
  }

  /**
   * Given an int array, return a new array with double the length where its last element is
   * the same as the original array, and all the other elements are 0. The original array will
   * be length 1 or more. Note: by default, a new int array contains all 0's.
   *
   * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
   * makeLast([1, 2]) → [0, 0, 0, 2]
   * makeLast([3]) → [0, 3]
   *
   * @param nums An int array.
   * @return A new array with double the length of input array and last element is the same.
   */
  public int[] makeLast(int[] nums) {
    int[] result = new int[nums.length * 2];
    Arrays.fill(result, 0);
    result[result.length - 1] = nums[nums.length - 1];
    return result;
  }

  /**
   * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
   *
   * double23([2, 2]) → true
   * double23([3, 3]) → true
   * double23([2, 3]) → false
   *
   * @param nums An int array
   * @return True if the array contains 2 twice or 3 twice.
   */
  public boolean double23(int[] nums) {
    if (nums.length != 2) {
      return false;
    }
    return (nums[0] == 2 || nums[0] == 3) && nums[0] == nums[1];
  }

}
