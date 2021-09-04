
	/*Program : 3 
	swap 2 numbers with using 3rd variable*/
package somnath;	
public class Assignment26_3 {
	void processData(int num1, int num2) {
		System.out.println("Before swapp. num1 = " + num1 + " & num2 = " + num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After  swapp. num1 = " + num1 + " & num2 = " + num2);
	}

	public static void main(String[] args) {
		Assignment26_3 assignment26_3 = new Assignment26_3();
		assignment26_3.processData(10,12);
	}
}