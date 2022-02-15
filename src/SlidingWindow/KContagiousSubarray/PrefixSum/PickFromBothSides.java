package SlidingWindow.KContagiousSubarray.PrefixSum;

public class PickFromBothSides {

    public static int maxScore(int[] cardPoints, int k) {
        int start = 0;
        int sum = 0;
        int ans = 0;
        while(start<=k-1)
        {
            sum = sum + cardPoints[start];
            start++;
        }
        ans = Math.max(sum,Integer.MIN_VALUE);
        int end = cardPoints.length-1;
        while(end != cardPoints.length-1-k)
        {
            sum = sum + cardPoints[end];
            end--;
            start--;
            sum = sum - cardPoints[start];
            ans = Math.max(sum,ans);
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] input = {1,2,3,4,5,6,1};
        System.out.println(maxScore(input,3));
    }
}