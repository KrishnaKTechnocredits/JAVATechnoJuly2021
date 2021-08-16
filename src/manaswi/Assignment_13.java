package manaswi;

class Assignment_13 {

	int countPositive(int[] num){
		int count=0;
		for(int index =0; index < num.length; index++) {
			if(num[index] > 0) {
				count++;
			}
		}
		return count;
	}
	int countZeroNumber(int[] num) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;
		}
		return count;
	}
	int[] fiveSmallerNumbers(int num) {
		int[] input = new int[5];
		int count = 0;
		for (int index = num; index > num - 5; num--) {
			if (count != 5) {
				input[count] = num - 1;
				System.out.println(input[count]);
				count++;
			}
		}
		return input;
	}



	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		int[] positive = {1,-11,-44,23,55,-99,-23,-22};
		Assignment_13 assignment_13 = new Assignment_13();
		System.out.println("Total Positive Number in array : "+assignment_13.countPositive(positive));
		System.out.println("Total Zeros in given array : "+assignment_13.countZeroNumber(input));
		assignment_13.fiveSmallerNumbers(50);


	}

}