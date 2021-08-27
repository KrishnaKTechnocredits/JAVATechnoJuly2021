package tanmoy_Roy.Assignment22;

import java.util.Scanner;

public class Program1 {
	
	int getCountOfDigits(String input) {
		String[] arr = input.replaceAll("[A-Za-z]+","").split("");  ///replace all alphabet char with "",then split the number string by ""
		int n=arr.length;
		if(n==0)
			return 0;
		else {
			if(arr[0].equals("") && n>0)				//adjust if alphabet is before numeric value
				return n-1;
			else
				return n;
		}
		
		
	}

	public static void main(String[] args) {
		Program1 prg = new Program1();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the String: ");
			String input = scan.nextLine();
			System.out.println("The count of digits is :"+ prg.getCountOfDigits(input));
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}
}