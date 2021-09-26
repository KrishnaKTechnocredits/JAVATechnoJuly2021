package ashit_asssignement_32;

public class Program1 {
	
	void getTripletsWithMaximumSum(int[] input) {
		int tripletSum = 0;
		int sum = 0;
		int tripletIndex = 0;
		for(int i = 0; i < input.length-2; i++) {
			if(input[i]==input[i+1]-1 && input[i+1]==input[i+2]-1) {
				tripletSum = input[i]+input[i+1]+input[i+2];
				if(tripletSum > sum) {
					sum = tripletSum;
					tripletIndex = i;
				}
			}
		}
		System.out.println("The sum of triplets "+input[tripletIndex] +" "+ input[tripletIndex+1] +" "+ input[tripletIndex+2] +" is "+sum);
	}
	public static void main(String[] args) {
		Program1 pgm = new Program1();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		pgm.getTripletsWithMaximumSum(arr);
	}
}


