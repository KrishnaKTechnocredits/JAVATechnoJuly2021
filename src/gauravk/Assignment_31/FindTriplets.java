package gauravk.Assignment_31;
/*
 * Assignment - 31 : 9th Sep'2021
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
Note : 23,24,25
       24,25,26
	   64,65,66

Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ 

-----------------------------------------------
 */
public class FindTriplets {

	void getTriplets(int[] input) {

		int index = 0;
		int counterIndex = 0;
		System.out.println("The triplets are: ");
		while (index < input.length - 2) {
			int num1 = input[index];
			if ((input[index + 1] == num1 + 1) && (input[index + 2] == num1 + 2)) {
				System.out.println(input[index]+","+input[index+1]+","+input[index+2]);
			}
			index++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		FindTriplets triplets = new FindTriplets();
		triplets.getTriplets(arr);
	}
}
