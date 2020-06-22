package arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Given an integer array and random integer, find if sum of
 * any two numbers in the array is equal to random integer
 */
public class TwoSumProblem {
    public static void main(String[] args){
        int[] result = findTwoSum(new int[]{2, 8, 11, 15}, 9);

        for ( int r: result){
            System.out.println(r);
        }

    }
    public static int[] findTwoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> numberMap= new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length; i++){
            int complement = target - nums[i];
            if (numberMap.containsKey(complement)){
                result = new int[]{numberMap.get(complement), i};
                break;
            }else{
                numberMap.put(nums[i], i);
            }
        }
        return result;
    }
}
