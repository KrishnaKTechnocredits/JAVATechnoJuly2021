package rushikesh.assign46;


import java.util.ArrayList;
import java.util.Arrays;

//Write a program to add element at particular index of ArrayList?

public class Assign46_16 {
	public static void main(String[] args) {
		String arr[] = {"java", "python", "c", "cpp", "html"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("\nInput list :: " + list);
		list.add(2, "Amravati");
		System.out.println("\nUpdated list after adding new element at index 3 :: " + list);
		list.set(4, "Pune");
		System.out.println("\nUpdated list after updating element at index 5 :: " + list);
	}
}
