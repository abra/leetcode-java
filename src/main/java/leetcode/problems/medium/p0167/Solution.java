package leetcode.problems.medium.p0167;

public class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      int num = numbers[left] + numbers[right];

      if (num == target) {
        return new int[]{left + 1, right + 1};
      } else if (num > target) {
        right--;
      } else {
        left++;
      }
    }

    return new int[]{};
  }
}
