/*Program : 3 
swap 2 numbers with using 3rd variable*/

package monika;

public class Assignment26_Program_3 {

	void swapNumbers(int num1,int num2) {
		System.out.println("Value of Numbers Before Swapping "+num1+" "+num2);
		
		int num3=0;
		num3=num2;
		num2=num1;
		num1=num3;
		System.out.println("Value of Numbers After Swapping: "+num1+" "+num2);
	}
	public static void main(String[] args) {
		Assignment26_Program_3 assignment26_Program_3=new Assignment26_Program_3();
		assignment26_Program_3.swapNumbers(50, 100);
	}
}
