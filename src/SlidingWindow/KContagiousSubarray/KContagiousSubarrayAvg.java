package SlidingWindow.KContagiousSubarray;

// array length & looping condition mistakes
// using index inplace of arrayElement

import java.util.*;

public class KContagiousSubarrayAvg {

    public static double[] getKContagiousSubarrayAvg_BruteForce(int[] input, int k) {
        double[] output = new double[input.length - k + 1];
        for (int i = 0; i <= input.length - k; i++) {
            double sum = 0;
            double avg = 0;
            for (int j = i; j <= i + k - 1; j++) {
                sum = sum + input[j];
            }
            avg = sum / k;
            output[i] = avg;
        }
        return output;
    }

    public static double[] getKContagiousSubarrayAvg(int[] input, int k) {
        double[] output = new double[input.length - k + 1];
        double sum = 0;
        double avg = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < input.length; windowEnd++) {
            sum = sum + input[windowEnd];
            if (windowEnd >= k - 1) {
                output[windowStart] = sum / k;
                sum = sum - input[windowStart];
                windowStart++;
            }
        }
        return output;
    }

//    Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
//    Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
//    Output: 3
//    Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

// {@link https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/}

    public static int numOfSubarraysAvgGreaterThanThreshold(int[] arr, int k, int threshold) {
        int startingWindow = 0;
        double sum = 0;
        int count = 0;
        double avg = 0;
        for(int endingWindow=0;endingWindow<arr.length;endingWindow++)
        {
            sum = sum + arr[endingWindow];
            if(endingWindow>=k-1)
            {
                avg = sum/k;
                sum = sum - arr[startingWindow];
                startingWindow++;
                if(avg>=threshold)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int[] input = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 25;
        double[] output = getKContagiousSubarrayAvg_BruteForce(input, k);
        double[] output_avg = getKContagiousSubarrayAvg(input, k);
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(output_avg));
//        Array.print_doubleArr(output);
//        Array.print_doubleArr(output_avg);
        int subArrayCount = numOfSubarraysAvgGreaterThanThreshold(input, k , threshold);
        System.out.println("NumOfSubarraysAvgGreaterThanThreshold : "+subArrayCount);
    }

}
