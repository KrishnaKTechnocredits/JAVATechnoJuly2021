package chandani.Assignment_33;

import java.util.Arrays;

public class Assignment33d {

		void getIncreasingTripletsAndSum(int[] input) {
			
			int count = 0;
			int num;
			int sum;
			int maxSum = 0;
			int maxIndex = 0;
			for(int index = 0; index < input.length - 2; index++) {
				num = input[index]; 
				if(num+1 == input[index+1]) {
					if(num+2 == input[index+2]) {
						count++;
						System.out.println("Triplet numbers in increasing order : " + input[index] + ","
								+ input[index +1] + "," + input[index + 2]);
						sum = input[index] + input[index+1] + input[index+2];
						
						System.out.println("Sum of triplets is : " + sum);
						
						if(sum > maxSum) {
							maxSum = sum;
							maxIndex = index;
						}
					}
				}
			}
			System.out.println("\n" + "Count of sequential triplets " + count);
			System.out.println( "\n" + "Triplet "+ input[maxIndex]+", "
					+ ""+ input[maxIndex+1]+", "+ input[maxIndex+2] + 
					" of consecutive numbers in the given array \n" 
					+ Arrays.toString(input) + " has max sum " + maxSum);
		}
		
		
		public static void main(String[] args) {
			Assignment33d assignment33d = new Assignment33d();
			int [] arr = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
			assignment33d.getIncreasingTripletsAndSum(arr);
			
		}
}

