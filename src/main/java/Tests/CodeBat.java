package Tests;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        array123([1, 1, 2, 3, 1]) → true
        array123([1, 1, 2, 4, 1]) → false
        array123([1, 1, 2, 1, 2, 3]) → true     */

public class CodeBat {

  public static boolean array123(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 3] == 3) count++;
    }
    if (count > 0) return true;
    return false;
  }


  public static void main(String[] args) {

    String name = "Lion";
    if (!(name.equals("Lio"))) {
      System.out.println("true");
    }
  }
}
