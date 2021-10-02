package aniket;

import java.util.Scanner;

public class Assignment_38 {

	void getFirstAndLastOccurence(String str)
	{
		System.out.println("\n\nInput String is :\n"+str );
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the word having last occurence :");
		String lastOccur=scan.nextLine();
		System.out.println("Enter the word having first occurence :");
		String firstOccur=scan.nextLine();

		String output = str.substring(str.lastIndexOf(lastOccur),str.indexOf(firstOccur)+firstOccur.length());

		System.out.println("\nOutput String  is :"+output);
	}

	public static void main(String[] args) {
		Assignment_38 a38 = new Assignment_38();
		a38.getFirstAndLastOccurence("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant");
		//a38.getFirstAndLastOccurence("\nHi This Is The Future Of the World And The World is Beautiful");
	}
}