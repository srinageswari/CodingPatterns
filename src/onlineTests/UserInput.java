package onlineTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UserInput {

//	4
	static void getSingleInput(BufferedReader input) throws NumberFormatException, IOException {
		System.out.println("SingleInput");
		int x = Integer.parseInt(input.readLine());
		System.out.println("Output = "+ x);

	}

//	3
//	1 3
//	2 2
//	4 5
	static void getSingleInputSpaceSeperatedMultipleInputCombination(BufferedReader input) throws IOException {
		System.out.println("SingleInputSpaceSeperatedMultipleInputCombination");
		int n = Integer.parseInt(input.readLine()); // here n=3
		int[] outputArr = new int[n*2];
		int k=0;
		for (int i = 0; i < n; i++) {
			StringTokenizer tk = new StringTokenizer(input.readLine());
			int p = Integer.parseInt(tk.nextToken());
			outputArr[k] = p;
			k++;
			int q = Integer.parseInt(tk.nextToken());
			outputArr[k] = q;
			k++;
		}
		System.out.println("Output = "+ Arrays.toString(outputArr));
	}

//	2 Balls
	static void getSpaceSeperatedSingleLineInput(BufferedReader input) throws IOException {
		System.out.println("SpaceSeperatedSingleLineInput");
		StringTokenizer tk = new StringTokenizer(input.readLine());
		int m = Integer.parseInt(tk.nextToken()); // 2
		String s = tk.nextToken(); // Balls
		System.out.println("Output ="+m+" "+s);
	}

//	3
//	1
//	7
//	6
	static void getMultiLineInput(BufferedReader input) throws NumberFormatException, IOException {
		// here n specifies number of inputs
		System.out.println("MultiLineInput");
		int n = Integer.parseInt(input.readLine()); // here n=3
		int[] outputArr = new int[n];
		int k=0;
		for (int i = 0; i < n; i++) {
			int output = Integer.parseInt(input.readLine());
			outputArr[k] = output;
			k++;
		}
		System.out.println("Output = "+ Arrays.toString(outputArr));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		getSingleInput(input);
		getSingleInputSpaceSeperatedMultipleInputCombination(input);
		getSpaceSeperatedSingleLineInput(input);
		getMultiLineInput(input);
	}

}
