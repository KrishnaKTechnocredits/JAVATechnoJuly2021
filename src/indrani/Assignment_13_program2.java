package indrani;

public class Assignment_13_program2 {
	static int count;
	
	void getCountOfZero(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]==0)
				count++;
		}
	     System.out.println("No of zeros from the array " +count);
		}
	public static void main(String[] args) {
    	int[] input = {2,0,-15,0,-44,-9,0,8,10};
    	Assignment_13_program2 program2 = new Assignment_13_program2();
    	program2.getCountOfZero(input);
     }
}

