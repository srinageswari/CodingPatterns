package Misc;

import java.util.*;

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
//
//    Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// {@link https://leetcode.com/problems/two-sum/}

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] solutions= null;
        int x=0,y=0;
        if(nums.length>=2)
        {
            for(int i=0; i<nums.length; i++)
            {
                x=nums[i];
                y=target-x;
                for(int j=i+1; j<nums.length; j++)
                {
                    if(nums[j]==y)
                    {
                        solutions = new int[2];
                        solutions[0] = i;
                        solutions[1] = j;
                        return solutions;
                    }
                }
            }
        }
        return solutions;
    }

    public static void print(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] input = {3,1,2,1,0,1,5};
        System.out.println(Arrays.toString(twoSum(input,8)));
    }
}
