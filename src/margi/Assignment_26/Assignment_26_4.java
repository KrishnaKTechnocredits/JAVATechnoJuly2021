package margi.Assignment_26;

public class Assignment_26_4 {
	
	//swap 2 numbers without using 3rd variable
	void processData(int num1, int num2) {
		System.out.println("Before swapping, num1 = " + num1 + " & num2 = " + num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping, num1 = " + num1 + " & num2 = " + num2);
	}
	
	public static void main(String[] args) {
		Assignment_26_4 assignment_26_4 = new Assignment_26_4();
		assignment_26_4.processData(15,25);
	}
}
