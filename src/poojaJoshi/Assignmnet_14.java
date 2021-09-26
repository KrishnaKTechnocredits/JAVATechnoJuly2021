/*prgram 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98/ max no -min no */

package poojaJoshi;

public class Assignmnet_14 {
	int max = 0;
	int count = 0;
	int min = 99;

	void minAndMax(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] >= max) {
				max = num[index];
				count++;
			}
		}
		System.out.println("Maximum number is " +min);
		System.out.println("*************************************");
	}

	void minNum(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] <= min) {
				min = num[index];
				count--;

			}
		}
		System.out.println("Minimum number is " +min);
		System.out.println("*************************************");
	}

	void diffMinMax(int[] num) {
		int max = 0;
		int min = 100;
		int diffnum = 0;

		for (int index = 0; index < num.length; index++) { 
			if (num[index] > max) {
				max = num[index];

			}
		}
		//System.out.println("no is maximum " + max);

		for (int index = 0; index < num.length; index++) {
			if (num[index] < min) {
				min = num[index];

			}
		}
		//System.out.println("Minimum number is " + min);

		diffnum = max - min;
		System.out.println("Diff between min and max num is " + diffnum);
		System.out.println("*************************************");
	}

	void oddEvenDiff(int[] number) {
		int odd=0;
		int even=0;
		int oddeveDiff=0;
				for (int index = 0; index < number.length; index++) {
					if (number[index] % 4 == 0) {
						even=number[index];
					//	if (number [index] > even)
						//	even=number[index];
					}else {
						if (number[index] % 2 !=0)
							if (number[index]> odd)
								odd=number[index];
						}
				}
				System.out.println("Given values are {1,11,44,23,55,99,23,22}");
				//System.out.println("Output is as below");
				System.out.println("Even number is "+even);
				System.out.println("Odd Number is "+odd);
				oddeveDiff=odd-even;
				System.out.println("Difference of odd and even no is "+oddeveDiff);
				
						
	}
	

	public static void main(String[] args) {
		Assignmnet_14 assignmnet_14 = new Assignmnet_14();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		assignmnet_14.minAndMax(input);
		assignmnet_14.minNum(input);
		assignmnet_14.diffMinMax(input);
		
		Assignmnet_14 assignmnet_14_3_1 = new Assignmnet_14();
		int[] inputoddEven = {1,11,44,23,55,99,23,22};
		assignmnet_14_3_1.oddEvenDiff(inputoddEven);

	}
}
