package indrani;

public class Assignment_13_program1 {
	static int count;
	
	void returnCount(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]>0)
				count++;
		}
     System.out.println("No of positive integers from the array " +count);
	}
     public static void main(String[] args) {
    	int[] input = {2,3,-15,30,-44,-9,0,8,10};
    	Assignment_13_program1 program1 = new Assignment_13_program1();
    	program1.returnCount(input);
     }
}

