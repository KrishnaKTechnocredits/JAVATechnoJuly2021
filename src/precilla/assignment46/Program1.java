package precilla.assignment46;

import java.util.ArrayList;
import java.util.Scanner;

//Write a program to find given number is present in the arrayList or not.
public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(45);
		al.add(26);
		al.add(48);
		System.out.println(al);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=s.nextInt();
		if(!al.contains(number)) {
			System.out.println(number +" is not present");
		}else {
			System.out.println(number +" is present");
		}
		s.close();
	}

}
