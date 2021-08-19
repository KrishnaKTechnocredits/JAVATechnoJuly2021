package sourabh;

public class Assignment_13 {

	//program 1
	static int positiveNumbers(int[] input, int length) {
		int count  = 0;
		for (int index = 0; index<length; index++) {
			if (input[index]>0) {
				count++;
			}
		}
		return count;
	}

	//program 2
	static int countzero(int[] input, int length) {
		int count  = 0;
		for (int index = 0; index<length; index++) {
			if (input[index]==0) {
				count++;
			}
		}
		return count;	
	}

	//program 3
	 static int[] getNumbers (int num) {
		int[] output = new int[5];
		for (int index = 0; index<5; index++) {
			num--;
			output[index] = num;
		}
		return output;
	}


	public static void main(String[] args) {
		int[] input1 = new int[8];

		input1[0]  = 1;
		input1[1]  = -11;
		input1[2]  = -44;
		input1[3]  = 23;
		input1[4]  = 55;
		input1[5]  = -99;
		input1[6]  = -23;
		input1[7]  = -22;

	    int count1 = positiveNumbers (input1, 8);
		System.out.println(count1);

		int[] input2= new int[8];

		input2[0]  = 1;
		input2[1]  = -11;
		input2[2]  = 0;
		input2[3]  = 0;
		input2[4]  = 55;
		input2[5]  = 0;
		input2[6]  = -23;
		input2[7]  = 0;

		int count2 = countzero(input2, 8);
		System.out.println(count2);

		int[] count3  = getNumbers(50);
		for(int index=0; index<5; index++) {
			System.out.print(count3[index]  + " ");
		}
	}
}
