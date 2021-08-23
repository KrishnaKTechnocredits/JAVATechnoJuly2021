package swati;
import java.util.*;
class SumOfAllNumbers{
	
	void printSum(String input){
		String[] inputArray=input.split(" ");
		int sum=0;
		for(int index=0;index<inputArray.length;index++){
			
			sum=sum+Integer.parseInt(inputArray[index]);
		}
		System.out.println("Sum of all numbers in given statement: "+sum);
	}
	
	public static void main(String[] a){
		SumOfAllNumbers sumOfAllNo=new SumOfAllNumbers();
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the statement:");
		String input=scan.nextLine();
		sumOfAllNo.printSum(input);
		scan.close();
	}
}