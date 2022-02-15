package Misc;

import java.util.Arrays;

public class MoveNegativeNumbers {

    public static int[] moveNegative(int[] arr)
    {
        int temp = 0;
        int j=0;
        for(int i=0 ; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                if(i!=j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]) {
        int[] input = {3,-1,0,-2,1,0,-1,0};
        System.out.println(Arrays.toString(moveNegative(input)));
    }

    //i=0 j=. 0
    //i=1 j=09ikl,j ;
}
