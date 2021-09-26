/*Program : 4 
swap 2 numbers without using 3rd variable*/

package monika;

public class Assignment26_Program_4 {

	void swapNumbersWithout3rdVariable(int num1,int num2) {
		
		System.out.println("Value of Numbers Before Swapping "+num1+" "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Value of Numbers After Swapping: "+num1+" "+num2);
	}
	public static void main(String[] args) {
		Assignment26_Program_4 assignment26_Program_4=new Assignment26_Program_4();
		assignment26_Program_4.swapNumbersWithout3rdVariable(100,200);
	}
	
}
