package Misc;

//    Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//    Example 1:
//
//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]

//    {@link https://leetcode.com/problems/rotate-array/}

public class ArrayRotation {

    public static void rotate(int[] nums, int k) {

        if(nums.length>1)
        {
            if(k>nums.length)
            {
                k=k%nums.length;
            }
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }

    }

    public static void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp = nums[end];
            nums[end]=nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
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
        rotate(input,3);
        print(input);
    }
}
