package neha.assignment_46;

import java.util.ArrayList;
import java.util.Scanner;

/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/
public class Program2 {
	ArrayList<Integer> al = new ArrayList<Integer>();

	void findDuplicateNumberInArrayList(int num) {
		ArrayList<Integer> output = al;
		if (output.contains(num)) {
			output.remove(new Integer(num));
			if (output.contains(num))
				System.out.println("Number " + num + " is duplicate");
			else
				System.out.println("Number " + num + " is not duplicate");
		} else
			System.out.println("Number is not present in the array list");
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		program2.al.add(56);
		program2.al.add(2);
		program2.al.add(45);
		program2.al.add(56);
		program2.al.add(18);
		program2.al.add(29);
		program2.al.add(17);
		program2.al.add(76);
		program2.al.add(17);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide number for searching duplicate:");
		int numToSearch = scan.nextInt();
		program2.findDuplicateNumberInArrayList(numToSearch);
		System.out.println("\r\nPlease provide number for searching duplicate:");
		numToSearch = scan.nextInt();
		program2.findDuplicateNumberInArrayList(numToSearch);
		System.out.println("\r\nPlease provide number for searching duplicate:");
		numToSearch = scan.nextInt();
		program2.findDuplicateNumberInArrayList(numToSearch);
	}
}
