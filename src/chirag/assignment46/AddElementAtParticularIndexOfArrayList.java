package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to add element at particular index of ArrayList

public class AddElementAtParticularIndexOfArrayList {
	
	public static void main(String[] args) {
		String [] str = {"Chirag","Rahul","Rajat","Aadarsh","Kunal"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(str));
		System.out.println("Before Adding element in a list "+al);
		al.add(2, "Preeti");
		System.out.println("After adding element at 2nd index "+al);
	}
}
