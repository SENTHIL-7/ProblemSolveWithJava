/*
 * Write a python function nearest_palindrome ()
Which can accepts a number and return the nearest greater palindrome number.
Input: 12300 -> output: 12321
Input: 12331 -> output: 12421
 */

import java.util.*;
public class Palindrome {
     
	public static boolean polind(int num) {
		int num1=num;
		String num2=Integer.toString(num);
		String rn="";
		for(int i=num2.length()-1;i>=0;i--) {
			rn+=num2.charAt(i);
		}
		return num1==Integer.parseInt(rn);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		while(true) {
			if(polind(N)) {
				System.out.println(N);
				break;
			}
		
			N++;
		}

	}

}
