package dattaraj;

public class Assignment_13_P3 {
	void getSmallerNumbers(int input) {
		int output[] = new int[5];
		System.out.println("5 smaller numbers from the number " + input + " are:- ");
		for(int index=0; index<5; index++) {
				input --;
				output[index] = input;
				System.out.println(output[index]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_13_P3 p3 = new Assignment_13_P3();
		p3.getSmallerNumbers(50);
	}

}
