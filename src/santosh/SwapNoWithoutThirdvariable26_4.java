package santosh;
import java.util.Scanner;

public class SwapNoWithoutThirdvariable26_4 {
	static int num1,num2;
	void getSwapNumbers() {
		System.out.println("Numbers before swapping - num1= "+ num1 +" and num2= " + num2); 
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Numbers after swapping - num1= "+ num1 +" and num2= " + num2); 
	}
	public static void main(String[] args) {
		SwapNoWithoutThirdvariable26_4 swapNoWithoutThirdvariable=new SwapNoWithoutThirdvariable26_4();
		Scanner scanner = new Scanner(System.in);  
	    System.out.println("Enter the value of num1 and num2");  
	    num1 = scanner.nextInt();  
	    num2 = scanner.nextInt(); 
	    swapNoWithoutThirdvariable.getSwapNumbers(); 


	}

}
