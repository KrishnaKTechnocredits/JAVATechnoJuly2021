package nidhi;

import java.util.Scanner;
class Assignment_21{
	
	int diffOldestAndYoungest(int members){
		Scanner scanner= new Scanner(System.in);
		int mem[]=new int[members];
		int max=0;
		int min=0;
		for(int i=0;i<members;i++){
			System.out.println("Enter the age : ");
			mem[i] = scanner.nextInt();
			if (max < mem[i]){
				max = mem[i];
			}
			
			if (min > mem[i] || min ==0 ){
				min = mem[i];
			}
		}
				
		return (max-min);
	}
	
	public static void main(String[] arg){
	Assignment_21 assignment21 = new Assignment_21();
	Scanner scanner= new Scanner(System.in);
	System.out.println("How many family members do you have?");
	int members = scanner.nextInt();
	System.out.println("The difference between ages is : " + assignment21.diffOldestAndYoungest(members));
	}
	
	
}