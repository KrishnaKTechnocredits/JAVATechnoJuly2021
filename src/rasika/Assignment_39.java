package rasika;

public class Assignment_39 {

	void printFibonacciseries() {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for(int index = 0; index < 10; index++) {
			int num3 = num1 + num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;	
		}
	}
	public static void main(String[] args) {	
		Assignment_39 assignment_39 = new Assignment_39();
		assignment_39.printFibonacciseries();
	}
}
