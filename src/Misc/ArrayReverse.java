package Misc;

public class ArrayReverse {

	public static void main(String[] args) {
		ArrayReverse rev = new ArrayReverse();
		int size = 4;
		int[] a = new int[size];
		for(int i=1 ; i<=a.length; i++)
		{
			a[i-1] = i;
		}
		int[] b = rev.bruteForce(a);
		rev.print(b);
		
		a = rev.swapping(a);
		rev.print(a);
	}

	private int[] bruteForce(int[] a) {
		int[] b = new int[a.length];
		for(int i=a.length-1,j=0; i>=0 && j<b.length; i--,j++)
		{
			b[j] = a[i];
		}
		System.out.println("Brute Force approach");
		return b;
	}
	
	private int[] swapping(int[] a)
	{
		int temp = 0;
		for(int i=0; i<=(a.length-1)/2; i++)
		{
			temp = a[i];
			a[i] = a[a.length-(i+1)];
			a[a.length-(i+1)] = temp;
		}
		System.out.println("Swapping approach");
		return a;
	}
	
	private void print(int[] b)
	{
		for(int i=0; i<b.length; i++)
		{
		System.out.println(b[i]);
		}
	}

}
