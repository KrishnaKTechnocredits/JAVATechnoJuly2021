package madhavi;

import java.util.ArrayList;

public class RemovedMultipleOccOfString {
	void removeMultipleOccOfString(String str, ArrayList<String> output) {
		while (output.contains(str)) {
			output.remove(str);
		}
		System.out.println("Updated String array:-" + "\n" + output);
	}

	public static void main(String[] args) {
		ArrayList<String> listS= new ArrayList<String>();
		listS.add("Techno");
		listS.add("Chandni");
		listS.add("Amruta");
		listS.add("Parthav");
		listS.add("Mayur");
		listS.add("Amruta");
		listS.add("Credits");
		listS.add("Amruta");
		System.out.println("Original String array:-" + "\n" + listS);
		RemovedMultipleOccOfString str = new RemovedMultipleOccOfString();
		str.removeMultipleOccOfString("Amruta", listS);
	}
}