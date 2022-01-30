/*
Input: Given a list of numbers separated with a comma.The numbers 5 and 8 are present in the list.

Assume that 8 always comes after 5.

Case 1: num1 -> Add all numbers which do not lie between 5 and 8 in the Input List.

Case 2: num2 -> Numbers formed by concatenating all numbers from 5 to 8 in the list

.Output: Sum of num1 and num2

Example: 3,2,6,5,1,4,8,9

Num1: 3+2+6+9 =20

Num2: 5148O/p=5148+20 = 5168

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] =br.readLine().split(",");
		
		int n = str.length;
		int arr[] =new int[n];
		int fiveIndex=0;
		int eigthIndex =0;
		int num1=0;
		String num2="";
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(str[i]);
			 if(arr[i]==5) {
				 fiveIndex=i;
			 }
			 else if(arr[i]==8){
				 eigthIndex=i;
			 }
		}
		
		for(int i=fiveIndex;i<=eigthIndex;i++) {
			num2 +=str[i];
			arr[i]=0;
		}
		
		for(int ar:arr) {
			num1 +=ar;
		}
		System.out.println(num1 + Integer.parseInt(num2));

	}

}
