/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/
package shalaka.Assignment28;

public class FindSecondMaxNo {

	int getSecondMaxNo(int[] arr) {
		int maxNo = arr[0];
		int secMaxNo = arr[1];
		if (arr[1] > arr[0]) {
			maxNo = arr[1];
			secMaxNo = arr[0];
		}
		for (int index = 2; index < arr.length; index++) {
			if (arr[index] > maxNo) {
				secMaxNo = maxNo;
				maxNo = arr[index];
			} else if (arr[index] > secMaxNo) {
				secMaxNo = arr[index];
			}
		}

		return secMaxNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		FindSecondMaxNo findSecondMaxNo = new FindSecondMaxNo();
		int secMaxNo = findSecondMaxNo.getSecondMaxNo(arr);
		System.out.println("The second highest number from array is: " + secMaxNo);
	}

}
