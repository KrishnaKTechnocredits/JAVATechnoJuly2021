/*program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45*/

package varun_array_assignment;

public class Assignment_13_2 {
	int[] input = new int[5];
	int count =0;
	int []fiveSmallerNumberFromGivenNumber(int num){
		for(int index=num;index>num-5;num--) {
			if(count!=5) {
				input[count]=num-1;
				System.out.println(input[count]);
				count++;
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment_13_2 assignment_13_2 = new Assignment_13_2();
		assignment_13_2.fiveSmallerNumberFromGivenNumber(50);
	}
}
