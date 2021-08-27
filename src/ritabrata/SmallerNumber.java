/*Assignment 13:
program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45*/


package ritabrata;

public class SmallerNumber {
	int[] inputNumber(int input) {
		int[] smallerNumber= new int[5];
		int count=0;
		for(int index=input; index>input-5; input--) {
			if(count!=5) {
				smallerNumber[count]=input-1;
				System.out.println("The smaller numbers are: "+smallerNumber[count]);
				count++;
			}
		}
		
		
		return smallerNumber;
	}

	public static void main(String[] args) {
		SmallerNumber smallerNumber= new SmallerNumber();
		smallerNumber.inputNumber(50);
		
		
				

	}
}

