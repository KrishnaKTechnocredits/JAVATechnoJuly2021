package indrani;

public class Assignment_13_program3 {
	
	void getSmallerNumbers(int input) {
		int output[] = new int[6];
		System.out.println("6 smaller numbers from the given number are : " );
		for(int index=0; index<6; index++) {
			input --;
			output[index] = input;
			System.out.println(output[index]);
		}
	}
     public static void main(String[] args) {
    	 Assignment_13_program3 program3 = new Assignment_13_program3();
    	 program3.getSmallerNumbers(60);
     }
}
