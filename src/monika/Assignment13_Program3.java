package monika;

public class Assignment13_Program3 {
	void getSmallerNumbers(int input) {
		int output[] = new int[5];
		System.out.println("Five smaller numbers from the number " + input + " are:- ");
		for(int index=0; index<5; index++) {
				input --;
				output[index] = input;
				System.out.println(output[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment13_Program3 program3 = new Assignment13_Program3();
		program3.getSmallerNumbers(50);
	}
}
