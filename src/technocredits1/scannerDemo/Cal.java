package technocredits1.scannerDemo;

import java.util.Scanner;

public class Cal {
	
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) {
		Cal cal1 = new Cal();
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter name : ");
		String name = scanner.next();
		System.out.println("Given name is " + name );
		cal1.add(num1, num2);
		
		System.out.println("Address : ");*/
		double line = scanner.nextDouble();
		System.out.println(line);
		
	}
}
