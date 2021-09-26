package margi.Assignment_26;

public class Assignment_26_3 {

	//swap 2 number using 3rd variable
	void processData(int num1, int num2) {
		System.out.println("Before swapping, num1 = " + num1 + " & num2 = " + num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping, num1 = " + num1 + " & num2 = " + num2);
	}
	
	public static void main(String[] args) {
		Assignment_26_3 assignment_26_3 = new Assignment_26_3();
		assignment_26_3.processData(10,20);
	}
}
