/*
*program 1*:  wap that will return difference of even length name and odd length name.
arr[0] = "Maulik";		
arr[1] = "Techno";		
arr[2] = "Nidhi";		
arr[3] = "Ankit";
output : 2
*/
package amol_Vyas.Assignment_15;

public class ArrayProgram_1 {
static int x=10;
	int getDifferenceEvenOddLength(String[] num) {
		int sumEven=0;
		int sumOdd=0;
		for (int index=0;index<num.length;index++) {
			if(num[index].length()%2==0)
				sumEven+=num[index].length();
			else
				sumOdd+=num[index].length();
		}
		return sumEven-sumOdd;
	}
	
	public static void main(String[] args) {
		 String[] input = {"Maulik","Techno","Nidhi","Ankit"};
		ArrayProgram_1 arrayProgram_1 = new ArrayProgram_1();
		System.out.println("Difference of even length name and odd length name is "+arrayProgram_1.getDifferenceEvenOddLength(input));
	}
	
}
