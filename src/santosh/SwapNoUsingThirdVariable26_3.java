package santosh;
import java.util.Scanner;

public class SwapNoUsingThirdVariable26_3 {
	 static int num1,num2,num3;
	 void getSwapNumbers() {
		System.out.println("Numbers before swapping: "+num1 +"  "+ num2); 
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("Numbers after swapping: "+num1 +"  " + num2);  


	}

	public static void main(String[] args) {  
		SwapNoUsingThirdVariable26_3 swapNoUsingThirdVariable=new SwapNoUsingThirdVariable26_3();
	       Scanner scanner = new Scanner(System.in);  
	       System.out.println("Enter the value of num1 and num2");  
	       num1 = scanner.nextInt();  
	       num2 = scanner.nextInt(); 
	       swapNoUsingThirdVariable.getSwapNumbers(); 

	    }    

	}
