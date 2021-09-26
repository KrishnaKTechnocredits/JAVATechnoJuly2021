package chandni_bhoj;

public class Assignment_13 {

	int getCountOfPositiveNumber (int [] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) 
				count++;

		}
		return count;

	}

	int getNumberOfZeros (int [] args ) {
		int count = 0;
		for (int index = 0; index < args.length; index++) {
			if (args[index] == 0)
				count++;	
		}
		return count;
	}

	void getSmallerNumbers (int num) {
		int count = num-5;
		int index = num-1;
		while(index < num) {
			if (index >= count)
				System.out.print (index + " , ");
			index--;

		}
	}

	public static void main(String[] args) {
		Assignment_13 assignment_13 = new Assignment_13 ();
		int [] input = new int [8];
		input[0] = 1;
		input[1] = -11;
		input[2] = -44;
		input[3] = 23;
		input[4] = 55;
		input[5] = -99;
		input[6] = -23;
		input[7] = -22;
		assignment_13.getCountOfPositiveNumber(input);
		System.out.println (assignment_13.getCountOfPositiveNumber(input));

		int [] output = new int [8];
		output[0] = 1;
		output[1] = -11;
		output[2] = 0;
		output[3] = 0;
		output[4] = 55;
		output[5] = 0;
		output[6] = -23;
		output[7] = 0;
		assignment_13.getNumberOfZeros(output);
		System.out.println (assignment_13.getNumberOfZeros(output));

		assignment_13.getSmallerNumbers(50);



	}
}
