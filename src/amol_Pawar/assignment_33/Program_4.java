package amol_Pawar.assignment_33;

public class Program_4 {

	void getTripleWithMaxSum(int[] input) {
		int maxNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < input.length - 2) {
				if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
					if (maxNum < input[index]) {
						maxNum = input[index];
					}
				}
			}
		}
		
		System.out.println("Triple which in sequence and having maximum sum is : "+maxNum+" "+(maxNum+1)+" "+(maxNum+2));
	}
	public static void main(String[] args) {
		Program_4 program_4 = new Program_4();
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		program_4.getTripleWithMaxSum(input);
	}

}
/*
 * program 4 : find the triple which in sequence and having maximum sum
 * 
 * input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99}; iteration : 3,4,5 9,10,11
 * 10,11,12 1,2,3 output : 10,11,12
 */
