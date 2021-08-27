/*
 * WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

 */

package tanmoy_Roy.CodingTest_1;

import java.util.Scanner;

public class Program {

	int getCountOfDigits(String[] input) {
		int k=0,sum=0;
		while(k<input.length) {
			String[] arr = input[k].replaceAll("[A-Za-z]+"," ").split(" ");
			int i=0,n=arr.length;
			if(n==0)
				sum+=0;
			else {
				if(arr[0].equals("") && n>0)				//adjust if alphabet is before numeric value
					i=1;
				while(i<n)
					sum+=Integer.parseInt(arr[i++]);
			}
			k++;
		}
		return sum;

	}

	public static void main(String[] args) {
		Program prg = new Program();
		Scanner scan =new Scanner(System.in);
		String[] input = {"t2e4c","2h7no","3h6h2h5", "1mk3", "k9g8","100","100fwg100","gyfyebf"}; 
		System.out.println("The sum of digits is :"+ prg.getCountOfDigits(input));
		scan.close();
	}
}
