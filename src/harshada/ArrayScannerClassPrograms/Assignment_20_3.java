/* program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h
*/
package harshada.ArrayScannerClassPrograms;

import java.util.Scanner;

public class Assignment_20_3 {
		
		/*int findLetterFreq(String input, char letter) {
			int count=0;
			for(int index=0; index<input.length(); index++) {
				if(input.charAt(index)==letter)
					count++;	
			}
			return count;	
		}
		*/
		void findFrequency(String inputString) {
			for (int index = 0; index < inputString.length(); index++) {
				if (inputString.indexOf(inputString.charAt(index)) == inputString.lastIndexOf(inputString.charAt(index)))
					System.out.println(inputString.charAt(index));
			}
		}

		public static void main(String a[]) {
			Assignment_20_3 assignment_20_3=new Assignment_20_3();
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter a String ");
			String strInput=sc.next();
			assignment_20_3.findFrequency(strInput);
		}
	}

