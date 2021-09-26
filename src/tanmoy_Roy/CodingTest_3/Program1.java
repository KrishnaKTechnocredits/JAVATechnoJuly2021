/*
 * Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
 */

package tanmoy_Roy.CodingTest_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	
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
		Program1 prg = new Program1();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the array : ");
			String[] input = scan.nextLine().split(",");
			System.out.println("Enter the element to be removed: ");
			String element = scan.nextLine();
			System.out.println("The array with removed element  :"+
					Arrays.toString(prg.removeElementOfArray(input,element)));
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}

}
