package indu;

import java.util.Scanner;

public class FirstOccuranceAndLastOccurenceofWord_A38 {

	void getFirstAndLastOccurence(String str)
	{
		System.out.println("\n\nInput String is :\n"+str );
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the word havinf last occurence :");
		String lastOccur=scan.nextLine();
		System.out.println("Enter the word having first occurence :");
		String firstOccur=scan.nextLine();
						
		String output = str.substring(str.lastIndexOf(lastOccur),str.indexOf(firstOccur)+firstOccur.length());
		
		System.out.println("\nOutput String  is :"+output);
	}
	
	public static void main(String[] args) {
		FirstOccuranceAndLastOccurenceofWord_A38 a38 = new FirstOccuranceAndLastOccurenceofWord_A38();
		a38.getFirstAndLastOccurence("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant");
		a38.getFirstAndLastOccurence("\nHi This Is The Future Of the World And The World is Beautiful");
	}
}
