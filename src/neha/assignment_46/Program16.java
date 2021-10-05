package neha.assignment_46;

import java.util.ArrayList;

/*Example 17:
Write a program to add element at particular index of ArrayList?*/
public class Program16 {
	ArrayList<String> al = new ArrayList<String>();

	void updateElementAtDesiredIndexOfArrayList(int index, String name) {
		// set element after replacing element at particular index
		al.set(index, name);
		System.out.println(al);
	}

	void addElementAtDesiredIndexOfArrayList(int index, String name) {
		// adding elements at particular index by shifting other elements
		al.add(index, name);
		System.out.println(al);
	}

	public static void main(String[] args) {
		Program16 program16 = new Program16();
		int index = 3;
		String nameToAdd = "Aasavari";
		program16.al.add("Sara");
		program16.al.add("Aarchi");
		program16.al.add("Priya");
		program16.al.add("Sara");
		program16.al.add("Sonal");
		program16.al.add("Sai");
		program16.al.add("Sharvari");
		System.out.println("Original arrayList " + program16.al);
		System.out.println("\r\nAfter adding element " + nameToAdd + " at index " + index);
		program16.addElementAtDesiredIndexOfArrayList(index, nameToAdd);
		index = 4;
		String nameToUpdate = "Avani";
		System.out.println("\r\nAfter updating element " + nameToUpdate + " at index " + index);
		program16.updateElementAtDesiredIndexOfArrayList(index, nameToUpdate);
	}
}
