package precilla.assignment46;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to find given number is duplicate in arrayList.
public class Program2 {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int value=0;
		System.out.println("Enter size of the array");
		int size=s.nextInt();
		System.out.println("Enter values:");
		for(int index=0;index<size;index++) {
			value=s.nextInt();
			if(!al.contains(value))
				al.add(value);
			else 
				System.out.println(value + " is duplicate");
		}
		System.out.println(al);
		s.close();
	}
}

