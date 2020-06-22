package arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(",");
        int numberToRemove = Integer.parseInt(s.nextLine());
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);

        }
        System.out.println("Input Array");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        int len = removeElement(nums, numberToRemove);
        System.out.println("\nlength after removing " +numberToRemove + ",  " + len );
        System.out.println("Output Array");
       for ( int i = 0; i < len; i++){
           System.out.print(nums[i] + " ");
       }
    }
    public static int removeElement(int[] nums, int val) {
        int newIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newIndex] = nums[i];
                newIndex++;

            }
        }
        return newIndex;
    }
}
