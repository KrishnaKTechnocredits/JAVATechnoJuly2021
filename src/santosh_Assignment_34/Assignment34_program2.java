/*program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
*/
package santosh_Assignment_34;
import java.util.Arrays;
public class Assignment34_program2 {

void placeSumAfterTriplet(int input[]) {

		int tripletCount = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index + 1]+1) {
				tripletCount++;
			}

		}
		System.out.println("Triplets are : " + tripletCount);

		int size = input.length + tripletCount;
		int output[] = new int[size];
		int tempIndex = 2;
		output[0] = input[0];
		output[1] = input[1];
        output[0]=input[0];
		output[1]=input[1];
		for(int index=2; index< input.length; index++) {
			output[tempIndex++]=input[index];
			if(input[index-1]==input[index-2]+1 &&input[index]==input[index-1]+1) 
				output[tempIndex++]=input[index-1]+input[index-2]+ input[index];
		}
		System.out.println("Array after placing sum if triplet " + Arrays.toString(output)+"\n");
	}
     
	public static void main(String a[]) {
	Assignment34_program2 assprogram2= new Assignment34_program2();
	int input1[] = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
	System.out.println("Array Elements are : " + Arrays.toString(input1));
	assprogram2.placeSumAfterTriplet(input1);
	}
}