package paresh;

public class Assignment13 {
	int countoFPositiveNumbers;
	int countOfZeroes;
	int countSmaller;

	 void countOfPositiveNumbers(int[] arr) {

		 for(int index = 0;index < arr.length;index++) {
			 if(arr[index] > 0)
				 countoFPositiveNumbers++;

		 }
		 System.out.println("Total count of positive numbers in a given array :" +countoFPositiveNumbers);
	 }

	 void totalCountOfZero(int[] arr1) {
		 for(int index = 0;index < arr1.length;index++) {
			 if(arr1[index] == 0)
				 countOfZeroes++;
		 }
		 System.out.println("Total count of zeroes in a given array : " + countOfZeroes);
	 }

		int[] getFiveSmallerNumbers(int num) {
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
		Assignment13 assignment13 = new Assignment13();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		assignment13.countOfPositiveNumbers(input);

		System.out.println("-------------------------");

		int[] input1 = {1,-11,0,0,55,0,-23,0};
		assignment13.totalCountOfZero(input1);

		System.out.println("-------------------------");

		assignment13.getFiveSmallerNumbers(50);
	}

}