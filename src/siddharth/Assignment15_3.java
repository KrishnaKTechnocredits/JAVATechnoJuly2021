package siddharth;

public class Assignment15_3 {
	int evenNumber;
	int oddNumber;
	int diff;

	void evenOddDiff(int[] input){
		
		for(int index=0;index<input.length;index++){
			if(input[index]%2 == 0){
				evenNumber = evenNumber + input[index];
			}
			else {
				oddNumber = oddNumber + input[index];
			}
		}
	}
	
	void diff(){
		diff = oddNumber - evenNumber;  // 22 - 14 = 8
		System.out.println("difference between sum of even number & sum of odd numbers: " + diff);
	}
	
	public static void main(String[] args) {
	
		int[] input = {12,2,13,9};
		
		Assignment15_3 program3 = new Assignment15_3();
		program3.evenOddDiff(input);
		program3.diff();
		
	}
}
