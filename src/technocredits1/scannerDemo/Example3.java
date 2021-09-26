package technocredits1.scannerDemo;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide full details");
		String line = scanner.nextLine();
		System.out.println(line);
		System.out.println("Enter input : ");
		String temp = scanner.next();
		System.out.println("First input is " + temp);
	}
}
