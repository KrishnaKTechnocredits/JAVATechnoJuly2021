package ashit;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest_3 {

	String [] removeElementOfArray(String[] input,String element) {
		int i=0;
		String array="";

		while(i<input.length) {
			if(!input[i].equals(element))
				array+=input[i]+",";
			i++;
		}

		return array.split(",");

	}

	public static void main(String[] args) {
		CodingTest_3 codingTest_3 = new CodingTest_3();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the array : ");
			String[] input = scan.nextLine().split(",");
			System.out.println("Enter the element to be removed: ");
			String element = scan.nextLine();
			System.out.println("The array with removed element  :"+
					Arrays.toString(codingTest_3.removeElementOfArray(input,element)));
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}

}