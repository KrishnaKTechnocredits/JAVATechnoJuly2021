/*
 Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
 */

package tanmoy_Roy_Assignment21;

import java.util.Scanner;

public class Program1 {
	
	int diffMaxAndMin(String[] input) {
		int i=0,max=Integer.parseInt(input[0]),min=Integer.parseInt(input[0]),n=input.length,element=0;
		while(i<n) {
			element=Integer.parseInt(input[i]);
			if(max<=element)
				max=element;
			if(min>=element)
				min=element;
			i++;
		}
		return max-min;
	}

	public static void main(String[] args) {
		Program1 prg =new Program1();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array : ");
		String[] input = scan.nextLine().split(" ");
		System.out.println("The difference between Oldest member and Youngest member : "+prg.diffMaxAndMin(input));
		scan.close();

	}

}
