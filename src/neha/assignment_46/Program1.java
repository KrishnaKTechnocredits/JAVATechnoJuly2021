package neha.assignment_46;

import java.util.ArrayList;
import java.util.Scanner;

/*Example 1 : 
Write a program to find given number is present in the arrayList or not.*/
public class Program1 {
	ArrayList<Integer> al = new ArrayList<Integer>();

	void findGivenNumberInArrayList(int num) {
		if (al.contains(num))
			System.out.println("Number " + num + " is present");
		else
			System.out.println("Number " + num + " is not present");
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.al.add(2);
		program1.al.add(45);
		program1.al.add(56);
		program1.al.add(18);
		program1.al.add(29);
		program1.al.add(17);
		program1.al.add(76);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide number for searching:");
		int numToSearch = scan.nextInt();
		program1.findGivenNumberInArrayList(numToSearch);
	}
}
