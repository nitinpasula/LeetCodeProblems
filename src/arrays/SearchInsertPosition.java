package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsertPosition {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] input = Arrays.stream(s.nextLine().split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int target = Integer.parseInt(s.nextLine());
        System.out.println("Target is found or to be inserted at " + execute(input, target));

    }
    public static int execute(int[] input, int target){
        return binarySearch(input, target, 0, input.length);
    }
    private static int binarySearch(int[] input, int target, int i, int j){
        int mid = ( i + j ) / 2;
        if ( mid == input.length || input[mid] == target){
            return mid;
        } else if ( target < input[mid]){
            if ( i == mid){
                return mid;
            } else {
                j = mid - 1;
                return binarySearch(input, target, i, j);
            }
        } else if ( target > input[mid]){
            if ( j == mid){
                return mid;
            } else {
                i = mid + 1;
                return binarySearch(input, target, i, j);
            }
        }
        return mid;
    }
}
