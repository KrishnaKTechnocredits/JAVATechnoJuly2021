package amol_Pawar.assignment_26;

public class Program_3 {

	void swapNum(int num1, int num2) {
		System.out.println("Numbers before swap : " + "Num1 = " + num1 + " and Num2=" + num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swap : " + "Num1 = " + num1 + " and Num2=" + num2);
	}

	public static void main(String[] args) {

		Program_3 program_3 = new Program_3();
		program_3.swapNum(12, 40);
	}

}
/*Program : 3 
swap 2 numbers with using 3rd variable
*/