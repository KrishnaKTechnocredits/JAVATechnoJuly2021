//Program to find specific element in array
//int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//specific number: 14
//output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}

package rasika;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest {
	
	int[] getElement(int[] input,  int number) {
		int num1 = 0;
		int output[] = new int[input.length];
		for(int index = 0; index < input.length; index++) {
			if(input[index] == number) {
				num1=number;
				//output[index]=(Integer)null;
			}
			else
				output[index] = input[index];
		}
		System.out.println("The number is "+num1);
		return output;
	}
	
public static void main(String[] args) {
	CodingTest codingTest = new CodingTest();
	int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number ");
    int number = scanner.nextInt();
    int[] output = codingTest.getElement(input,number);
    System.out.println("The array is " +Arrays.toString(output));
   /* for(int index =  0; index < output.length; index++) {
    	System.out.print(output[index]);	
    }*/
	//output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
}
}
