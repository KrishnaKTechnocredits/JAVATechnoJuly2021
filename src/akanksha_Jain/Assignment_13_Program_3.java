package akanksha_Jain;

public class Assignment_13_Program_3 {	
	

	void getSmallerNumbers(int input) {
		int output[] = new int[5];
		for(int index=0; index<5; index++) {
				input --;
				output[index] = input;
				System.out.println(output[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment_13_Program_3 program3 = new Assignment_13_Program_3();
		program3.getSmallerNumbers(50);
	}

}
