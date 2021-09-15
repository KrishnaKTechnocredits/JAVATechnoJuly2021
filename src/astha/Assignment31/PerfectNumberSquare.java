/*Assignment - 31 : 9th Sep'2021
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number
input : 50
output : 50 is not a perfect number
 
Program 2 : verify given number is a perfect square.
input : 25
output : 25 is perfect square.
input : 20
output : 20 is not a perfect square.
 
Program 3:
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25             	 24,25,26         	64,65,66
 
Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------
----------------------------------------------- */    	

package astha.Assignment31;

public class PerfectNumberSquare {

	/* method to check perfect number */
	boolean checkPerfectNumber(int num) {
		boolean flag = false;
		int sum = 0;
		for (int index = 1; index < num; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == num)
			flag = true;
		return flag;
	}

	/* method to check perfect square */
	void checkPerfectSquare(int num) {
		int temp = 0;
		for (int index = 1; index < num / 2; index++) {
			if (num % index == 0) {
				if (index * index == num) {
					temp = index;
					System.out.println(num + " is a perfect square of " + temp);
					break;
				}
			}
		}
		if (temp == 0)
			System.out.println(num + " is not a perfect square");
	}

	/* method to check perfect number in the given range */
	void findPerfectNumberInRange(int startIndex, int endIndex) {
		int count = 0;
		System.out.println("Perfect numbers in the range " + startIndex + " and " + endIndex + " are : ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (checkPerfectNumber(index)) {
				count++;
				System.out.println(index);
			}
		}
		if (count == 0)
			System.out.println("There are no perfect numbers between " + startIndex + " and " + endIndex);
	}

	/* method to display perfect number */
	void displayPerfectNumber(int num) {
		if (checkPerfectNumber(num))
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");
	}

	/* method to check triplets count */
	void getTripletsCount(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if ((input[index] == (input[index + 1] - 1)) && (input[index + 1] == (input[index + 2] - 1))) {
				count++;
				//System.out.println(input[index] + " " + input[index + 1] + " " + input[index + 2]);
			}
		}
		if (count != 0)
			System.out.println("The count of triplets in the given input array : " + count);
		else
			System.out.println("There are no triplets found in the given input array");

	}

	public static void main(String[] args) {
		PerfectNumberSquare perfectNumberSquare = new PerfectNumberSquare();
		perfectNumberSquare.displayPerfectNumber(10);
		perfectNumberSquare.displayPerfectNumber(6);
		perfectNumberSquare.checkPerfectSquare(50625);
		perfectNumberSquare.checkPerfectSquare(296);
		perfectNumberSquare.findPerfectNumberInRange(40, 170);
		int[] input = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		perfectNumberSquare.getTripletsCount(input);
	}

}
