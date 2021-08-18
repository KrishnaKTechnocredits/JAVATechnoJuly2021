/*

15th Aug'2021

program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3

program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};

output : 4


program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45


*/

package harshada;

public class Assignment_13 {
	
	int input1[]={1,-11,-44,23,55,-99,-23,-22};
	int input2[]={1,-11,0,0,55,0,-23,0};
	int arrayPositiveNumbers[];
	int countPositiveNumbers;
	int arrayZeroNumbers[];
	int countZeroNumbers;
	
	void getCountOfPositiveNumbers() {
		
		for(int index=0; index<= input1.length-1; index++) {
			if(input1[index] >= 0) {
				//arrayPositiveNumbers[index]=input [index];
				countPositiveNumbers++;
			}
		}
		System.out.println("No of Positive elements present in Array are= "+ countPositiveNumbers);

	}
	void getCountofZeroNumbers() {
			
			for(int index=0; index<= (input2.length-1); index++) {
				if(input2[index] == 0) {
					//arrayZeroNumbers[index]=input [index];
					countZeroNumbers++;
				}	
			}
			System.out.println("No of Zero elements present in Array are= "+ countZeroNumbers);
	}
	
	int [] getFiveSmallerNumbers(int value) {

		int input3[]=new int[5];
		for(int index=0; index<5; index++) {
			input3[index]=value-1;
			value--;
		}
		
		
		return input3;
	}
		
	public static void main(String args[] ) {
		Assignment_13 assignment_13 = new Assignment_13(); 
		assignment_13.getCountOfPositiveNumbers();
		assignment_13.getCountofZeroNumbers();
		int input4[]=new int[5];
		System.out.println("***Five Small numbers are:*** ");
		input4=assignment_13.getFiveSmallerNumbers(50);
		for(int i=0; i<5; i++) {
			System.out.println(input4[i]);
		}
		
	}
}
