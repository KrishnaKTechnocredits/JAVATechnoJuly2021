/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/

package parthav.parthavD_Assignment31;

public class FindTriplets {
	int countOfTriplets = 0;

	int getCountOfTriplets(int[] inputArr) {
		for (int index = 0; index < inputArr.length - 2; index++) {
			if ((inputArr[index] + 1  == inputArr[index+1]) && (inputArr[index] + 2 == inputArr[index + 2])) {
				countOfTriplets++;
			}
		}
		return countOfTriplets;
	}

	void printCountOfTriplets(int[] inputArr) {
		System.out.println("The count of triplets in the given array is: " + getCountOfTriplets(inputArr));
	}

	public static void main(String[] args) {
		
		CheckPerfectNumberPerfectSquare newObject = new CheckPerfectNumberPerfectSquare();
		newObject.printPerfectNumber(6);
		newObject.printPerfectNumber(50);
		newObject.printPerfectSquare(25);
		newObject.printPerfectSquare(50);
		FindTriplets newObject1 = new FindTriplets();
		int[] inputArr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		newObject1.printCountOfTriplets(inputArr);
		FindPerfectNumberInRange newObject2 = new FindPerfectNumberInRange();
		newObject2.printPerfectNumberInRange(40, 170);
		newObject2.printPerfectNumberInRange(1, 1000);
	}

}
