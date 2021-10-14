package pritiProgrammesOnNumbers;

import java.util.Scanner;

public class Assingment_31_4 {
	
	
	int finfPerfectNumber(int num) {
		int number= num; int count=0;
		int sum = 0;
		for (int index=1; index<num;index++) {
			if (number%index==0)
				sum += index;	
		}
		if (sum==num)
		System.out.println(num+"is perfect number");
		count++;
		return count;
		
	}
	
	void findPerfectNumInRange(int startNumber, int endNumber){
		int count=0;
		for (int number=startNumber; number<endNumber;number++) {
		 count = finfPerfectNumber(number);	
		}
		System.out.println("Total perfect numbers in the given range: "+ count);
	}
	
	
	public static void main(String[] a) {
		Scanner scanner= new Scanner (System.in);
		System.out.println("Please enter range to calculate perfect number:");
		System.out.println("Please enter the Start range number : ");
		int startNumber = scanner.nextInt();
		System.out.println("Please enter the End range number : ");
		int endNumber = scanner.nextInt();
		Assingment_31_4 assingment_31_4 = new Assingment_31_4();
		assingment_31_4.findPerfectNumInRange(startNumber,endNumber );
		scanner.close();
	}

}

/*Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170 
output : ------ */
