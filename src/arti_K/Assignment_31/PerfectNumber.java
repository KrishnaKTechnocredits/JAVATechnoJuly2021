/*	Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number
 */

package arti_K.Assignment_31;
public class PerfectNumber{

	int isPerfectNumber(int num){
	
		int sum = 0;
		
		for(int index = 1; index <= num/2; index++){
			
			if(num % index == 0)
				sum = sum + index;
		}
	return sum;
	}

	public static void main(String[] args){
		
		PerfectNumber perfectnumber = new PerfectNumber();
		int[] arr = {6,50};
		
		for(int index = 0; index < arr.length; index++) {
			
			int sum = perfectnumber.isPerfectNumber(arr[index]);
			
			if(sum == arr[index])
				System.out.println("Given number "+arr[index]+" is Perfect Number.");
			else
				System.out.println("Given number "+arr[index]+" is Not Perfect Number.");
		}
	}
}