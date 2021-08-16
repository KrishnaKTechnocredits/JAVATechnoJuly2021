/* Assignment 13 : 15th Aug'2021

program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3

program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};
output : 4


program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45 */

package astha.Assignment13;

public class Count {

	int countPositiveNumber(int[] input) {
		int count = 0;
		for(int index=0; index<input.length ;index++) {
			if(input[index] > 0)
				count++;
		}
		return count;
	}
	
	int countZerosInArray(int[] input) {
		int count = 0;
		for(int index=0; index<input.length ;index++) {
			if(input[index]== 0)
				count++;
		}
		return count;
	}
	
	int[] generateSmallerNumbers(int num) {
		int [] output = new int[5];
		for (int index =0; index <5; index++) {
			num =num-1;
			output[index] = num;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Count count = new Count();
		int [] inputarr1 = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Count of Postive numbers in the given array : "+count.countPositiveNumber(inputarr1));
		System.out.println("\n");
		int [] inputarr2 = {1,-11,0,0,55,0,-23,0};
		System.out.println("Count of Zeros in the given array : "+count.countZerosInArray(inputarr2));
		int [] outputarr = count.generateSmallerNumbers(50);
		System.out.println("\n");
		System.out.println("5 smaller numbers of the given number are : ");
		for(int index =0; index < outputarr.length; index++) {
			System.out.print(outputarr[index]+" ");
		}
	}
}
