/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/




package chandni_bhoj_Assignment_28;

public class Program_1 {
	
		int getHighestNumber (int [] input) {
			int highestNumber = input[0];
			int secondHighestNumber = input[1];
		for (int index = 2; index < input.length; index++) {
				if (input[index] > highestNumber) {
					secondHighestNumber = highestNumber;
					highestNumber = input[index];
				} else if (input[index] > secondHighestNumber) {
					secondHighestNumber = input[index];
				}
			
		}
		return secondHighestNumber;
		}
		
		public static void main(String[] args) {
			int [] input = {10,23,2,11,55,43,99};
			System.out.println (new Program_1().getHighestNumber(input));
		}
		
		
		
		
		
		


}
