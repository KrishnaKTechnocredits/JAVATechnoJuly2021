/*
 * Program 2 : Max repeating word with its freq.
input : Hello Hi Hello Hi Techno Hello Hi Techno Techno Techno
output : Techno -> 4
 */

package tanmoy_Roy.Assignment24;

import java.util.Scanner;

public class Program2 {
	
	void getMaxRepeatedWord(String input) {
		String arr[] = input.split(" ");
		String maxRepeatedString="";
		int maxCount=1,prevMaxCount;
		
		for(int i = 0 ;i < arr.length-1 ;i++) {		// logic to find the max count of the most repeated string
			prevMaxCount=1;
			for(int j = i+1 ;j < arr.length ;j++)
				if(arr[i].equals(arr[j])) 
					prevMaxCount++;
			
			if(prevMaxCount>maxCount) {
				maxCount=prevMaxCount;
				maxRepeatedString=arr[i];
			}
				
		}
		System.out.println("The Max repeated word is "+maxRepeatedString
				+" which is repeated : "+ maxCount +" times");
	}

	public static void main(String[] args) {
		Program2 prg =new Program2();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		prg.getMaxRepeatedWord(input);
		scan.close();

	}

}
