package priti.scannerClass_CharFreq;

import java.util.Scanner;

public class Assingment_21_1 {
	void diffBetOldestAndyoungest(int[] input) {
		int oldestAge=0;
		int youngestAge= input[0];
		for (int index=0;index<input.length;index++) {
			if (oldestAge<input[index]) {
				oldestAge=input[index];
			}else if (youngestAge>input[index]){
				youngestAge=input[index];
			}
			
		}
		System.out.println("Age of Oldest family member is"+oldestAge);
		System.out.println("Age of Youngest family member is"+youngestAge);
		System.out.println("Difference between Oldest and Youngest family member is : "+ (oldestAge-youngestAge));
	}
	
	
	public static void main(String[] a) {
		Assingment_21_1 assingment_21_1 = new Assingment_21_1();
		Scanner scanner= new Scanner (System.in);
		System.out.println("How many values you want to enter for age:");
		int temp= scanner.nextInt();
		int [] age=new int[temp];
		for (int index=0;index<temp;index++) {		
			System.out.println("please enter " +index+ " value for age: ");		
			age [index] = scanner.nextInt();	
		}
		
		assingment_21_1.diffBetOldestAndyoungest(age);
		
		
		
		
	}			
}		

/*Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

	

