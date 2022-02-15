package Misc;

// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
public class MinMax {

    public static void bruteForce(int[] a) {
        int temp = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Minimum : " + a[0] + " Maximum " + a[a.length - 1]);
    }

    public static void take_FirstTwo_CompareWithOne(int[] a) {
        int n = a.length;
        int min = 0;
        int max = 0;
        if (n == 1) {
            min = a[0];
            max = a[0];
        }
        if (n == 2) {
            if (a[0] > a[1]) {
                min = a[1];
                max = a[0];
            } else {
                min = a[0];
                max = a[1];
            }
        }
        if (n > 2) {
            if (a[0] > a[1]) {
                min = a[1];
                max = a[0];
            } else {
                min = a[0];
                max = a[1];
            }
            for (int i = 2; i <= a.length - 1; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }
        System.out.println("Minimum : " + min + " Maximum " + max);
    }

    public static void take_BasedOnEvenOdd_CompareWithPair(int[] a) {
        int n = a.length;
        int min = 0;
        int max = 0;
        int startIndex=0;

        if (n % 2 == 0) {
            if (a[0] > a[1]) {
                min = a[1];
                max = a[0];
            } else {
                min = a[0];
                max = a[1];
            }
            startIndex = 2;
        } else {
            min = a[0];
            max = a[0];
            startIndex = 1;
        }
        if (n > 2) {
            for(int i = startIndex; i<n-1; i=i+2)
            {
                if(a[i]<min)
                {
                    min = a[i];
                    if(a[i+1]<min)
                    {
                        min = a[i+1];
                    }
                }
                else
                {
                    if(a[i]>max)
                    {
                        max = a[i];
                        if(a[i+1]>max)
                        {
                            max = a[i+1];
                        }
                    }
                }
            }
        }
        System.out.println("Minimum : " + min + " Maximum " + max);
    }

    public static void main(String[] args) {
        int[] a = { 30, 60, 5, 10, 100 };
        bruteForce(a);
        take_FirstTwo_CompareWithOne(a);
        take_BasedOnEvenOdd_CompareWithPair(a);
    }

}
