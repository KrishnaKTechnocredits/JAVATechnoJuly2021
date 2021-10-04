package somnath_Assignment_38;
		/*Assignment - 38 : 24th Sep'2021
		find the substring starting from last hi to first Globant.  
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		output : Hi Credits Hello GM Neha Globant*/



import java.util.Scanner;

public class Assignment_38 {

	void getOccurence(String str)
	{
		System.out.println("\n\nInput String is :\n"+str );
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the Last occurence :");
		String lastOccur=scan.nextLine();
		System.out.println("Enter the First occurence :");
		String firstOccur=scan.nextLine();

		String output = str.substring(str.lastIndexOf(lastOccur),str.indexOf(firstOccur)+firstOccur.length());

		System.out.println("\nOutput String  is :"+output);
	}

	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		assignment_38.getOccurence("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant");
		
	}
} 
