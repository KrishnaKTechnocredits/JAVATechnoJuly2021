/*
 * Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

 */

package tanmoy_Roy.Assignment25;

import java.util.Scanner;

public class Program2 {
	
	int getSum(String input) {
		String arr[] = input.toLowerCase().split("[a-z]+");
		int i=0,sum=0;
		if(arr.length>0) {
			if(arr[0].equals("")) 	//adjust for "" appearing due to split
				arr[0]="0";
			while(i<arr.length)
				sum+=Integer.parseInt(arr[i++]);
		}
		else
			sum=0;
		
		return sum;
	}

	public static void main(String[] args) {
		Program2 prg =new Program2();
		Scanner scan =new Scanner(System.in);
		char ch='Y';
		while(true) {
			
			if (ch=='Y' || ch=='y') {
				System.out.println("Enter the string : ");
				String input = scan.nextLine();
				System.out.println("The Sum of numbers : "+prg.getSum(input));
			}
			else {
				System.out.println("Program Exited ");
				break;
			}
			System.out.println("Want to check more (Y/N) : ");
			ch = scan.nextLine().charAt(0);
		}
		scan.close();
	}

}
