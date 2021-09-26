package ankita;

import java.util.Scanner;

public class Wordcount {
	
	int getCount(String input) 
	{
		String[] arr=input.split(" ");
		//System.out.println("Word count is "+ arr.length);
		return arr.length;
	}
	
	String getMaxWord(String input)
	{
		String[] arr=input.split(" ");
		String output=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(arr[index].length()>output.length())
				output=arr[index];
		}
		//System.out.println("Word Max count is "+ output);
		return output;
	}
		
		String getMinWord(String input)
		{
			String[] arr=input.split(" ");
			String output=arr[0];
			for(int index=1;index<arr.length;index++) {
				if(arr[index].length()<output.length())
					output=arr[index];
			}
			//System.out.println("Word Minimum count is "+ output);
			return output;
	}
		
		int sumAllNo(String input) {
			int sum=0;
			String[] arr=input.split(" ");
			for(int index=0;index<arr.length;index++) {
				sum+=Integer.parseInt(arr[index]);
			}
			//System.out.println("sum of all no. is "+ sum);
			return sum;
			
		}
		
	public static void main(String[] args)
	{
		
	Wordcount wordcount=new Wordcount();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter String :-");
	System.out.println("words count is:-"+wordcount.getCount(scanner.nextLine()));
	
	System.out.println("Enter String :-");
	System.out.println("words maximum count is:-"+wordcount.getMaxWord(scanner.nextLine()));
	
	System.out.println("Enter String :-");
	System.out.println("words minimum count is:-"+wordcount.getMinWord(scanner.nextLine()));
	
	System.out.println("Enter String :-");
	System.out.println("sum of no. is:-"+wordcount.sumAllNo(scanner.nextLine()));
	
	}
}
