package chandni_bhoj_Assignment_28;

public class Program_2 {
	
	int getNthHighestNumber (int [] input, int nthHighestNumber) {
			int max = input[0];
			for (int index = 0; index < input.length; index++) {
				if (input[index] > max) {
					max = input[index];
					maxNumberIndex = index;
				}
				
			}
				return max;
	}

	public static void main(String[] args) {
		int [] input = {10,23,2,11,55,43,99};
		System.out.println (new Program_2().getNthHighestNumber(input));
	}
}
