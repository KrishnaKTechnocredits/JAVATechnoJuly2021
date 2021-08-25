package tanmoy_Roy.Assignment22;

import java.util.Scanner;

public class Program2 {
	
	int getCountOfDigits(String input) {
		String[] arr = input.replaceAll("[A-Za-z]+"," ").split(" ");
		int i=0,sum=0,n=arr.length;
		if(n==0)
			return 0;
		else {
			if(arr[0].equals("") && n>0)				//adjust if alphabet is before numeric value
				i=1;
			while(i<n)
				sum+=Integer.parseInt(arr[i++]);
			return sum;
		}
		
	}

	public static void main(String[] args) {
		Program2 prg = new Program2();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the String: ");
			String input = scan.nextLine();
			System.out.println("The sum of digits is :"+ prg.getCountOfDigits(input));
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}
}