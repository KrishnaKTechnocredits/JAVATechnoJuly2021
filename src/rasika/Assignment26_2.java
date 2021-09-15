package rasika;

import java.util.Scanner;

public class Assignment26_2 {
	
	void swapNumUsingThirdVar(int a, int b) {
		int temp = 0;
		temp = a;
		a= b;
		b = temp;
		System.out.println("After swaping Value of A : "+a);
		System.out.println("After swaping Value of B : "+b);
	}
	
	void swapNumWithoutThirdVar(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping Value of A : "+a);
		System.out.println("After swaping Value of B : "+b);
	}
	
	public static void main(String[] args) {
		Assignment26_2 assignment26_2 = new Assignment26_2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A :");
		int n1 = sc.nextInt();
		System.out.println("Enter Value of B :");
		int n2 = sc.nextInt();
		assignment26_2.swapNumUsingThirdVar(n1,n2);
		
		System.out.println("\n");
		
		System.out.println("Enter Value of A :");
		int num1 = sc.nextInt();
		System.out.println("Enter Value of B :");
		int num2 = sc.nextInt();
		assignment26_2.swapNumWithoutThirdVar(num1,num2);
	}
}
