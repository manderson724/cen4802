package Mod2_Fibo;

import java.util.Scanner;

/**
 * 
 * @author Marcus D Anderson
 *
 */

public class Mod2Fibo {
	/**
	 * This is a code for calculating the Nth term in the Fibonnaci sequence using the recursive method. 
	 * 
	 * @param n
	 * @return
	 */
	static int fibo(int n) {
		if (n <= 1)
			return n;
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Nth number.");
		int userNum = input.nextInt();
		System.out.println();
		
		System.out.print("The " + userNum );
		System.out.println("th term in the Fibonacci sequence is " + fibo(userNum));
	}
}