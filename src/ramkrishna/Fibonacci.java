package ramkrishna;

public class Fibonacci {

	void getFibonacci (int number) {

 		int sum = 0;
 		int num1 = 0;
 		int num2 = 1;

 		System.out.println("\nPrinting Fibonacci series "+number+ " times::");
 		System.out.print(num1);
 		System.out.print("," + num2);
 		for(int index=0; index<number-2; index++) {

 			sum = num1 + num2;
 			System.out.print("," + sum);
 			num1 = num2;
 			num2 = sum;
 		}
 	}

 	public static void main(String[] args) {

 		Fibonacci fibonacci = new Fibonacci();
 		fibonacci.getFibonacci(8);
 	}
 } 

