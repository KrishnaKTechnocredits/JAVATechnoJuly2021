package madhavi;
// Write a program to add element at particular index of ArrayList
import java.util.*;

public class Assignment_46_17 {
	
	public static void main(String[] args) {
		ArrayList<String> cityArr = new ArrayList<String>(Arrays.asList("Mumbai", "Kolkata", "Hyderabad", "Chennai"));
		System.out.println("ORIGINAL ARRAYLIST - "+cityArr);
		System.out.println("Adding City Indore in 3rd Postion (2nd Index) and Pune in 1st Position(0th Index)");
		
		cityArr.add(2, "Indore");
		cityArr.add(0, "Pune");
		
		System.out.println("ARRAYLIST AFTER ADDING CITIES - "+cityArr);
		
	}

}
