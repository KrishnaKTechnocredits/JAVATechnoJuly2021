package arti_G;
//Calculator
public class Assignment_1 {
		
		//Addition method
		void add(int num1,int num2){
			int sum = num1 + num2;
			System.out.println("Sum of 2 numbers is " + sum);
		}
		
		//Subtraction method
		void subtract(int num1,int num2){
			int sub = num1 - num2;
			System.out.println("Subtraction of 2 numbers is " + sub);
		} 
		
		//Multiplication method
		void multiple(int num1,int num2){
			int mul = num1 * num2;
			System.out.println("Multiplication of 2 numbers is " + mul);
		}
		
		//Division method
		void division(int num1,int num2){
			int div = num1 / num2;
			System.out.println("Division of 2 numbers is " + div);
		}
			
		public static void main(String[] a){
			Assignment_1 assignment_1 = new Assignment_1();
			assignment_1.add(50,30); //80
			assignment_1.subtract(30,20); //10
			assignment_1.multiple(25,10); //250
			assignment_1.division(200,5); //40
		}		
	}