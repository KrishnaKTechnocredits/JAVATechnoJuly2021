package suchita;

class Program2 {
	int getMinNumber(int[] num) {
		int min=num[0];
		for(int index=0;index<num.length;index++){
			if(num[index] < min)
				min = num[index];
		}
		return min;
	}
	
public static void main(String[] args) {
		
		Program2 assignment = new Program2();
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("\n Minimum number from given array :: " + assignment.getMinNumber(input));
}
}
