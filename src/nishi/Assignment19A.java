package nishi;

import java.util.Scanner;

public class Assignment19A {
	int cntNoOfWords(String input)
	{
		String[] arr =input.split(" ");
		return arr.length;
	}
	
	public static void main(String[] args) {
		Assignment19A assignment19A=new Assignment19A();		
		Scanner sc = new Scanner(System.in);
		System.out.println("input = ");
		String input=sc.nextLine();
		System.out.println("No of words is : "+assignment19A.cntNoOfWords(input));
	}

}
