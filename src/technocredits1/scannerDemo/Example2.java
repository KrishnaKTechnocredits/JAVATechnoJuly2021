package technocredits1.scannerDemo;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		String temp = scanner.next();
		System.out.println("First input is " + temp);
		System.out.println("Provide full details");
		scanner.nextLine();
		String line = scanner.nextLine();
		System.out.println(line);
	}
}
