
		/*Program : 4 
		swap 2 numbers without using 3rd variable*/
package somnath;
public class Assignment26_4 {
	void processData(int num1, int num2) {
		System.out.println("Before swapp. num1 = " + num1 + " & num2 = " + num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapp.  num1 = " + num1 + " & num2 = " + num2);
	}

	public static void main(String[] args) {
		Assignment26_4 assignment26_4 = new Assignment26_4();
		assignment26_4.processData(10,12);
	}
}