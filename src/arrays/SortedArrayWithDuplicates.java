package arrays;

import java.util.Scanner;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 */
public class SortedArrayWithDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(", ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Input Array\n");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("length after removing duplicates " + removeDuplicates(nums));
        System.out.println("Output Array \n");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        int newIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                newIndex++;
                nums[newIndex] = nums[i + 1];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
