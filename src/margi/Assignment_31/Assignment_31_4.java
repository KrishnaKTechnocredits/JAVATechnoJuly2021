package margi.Assignment_31;

import java.util.Scanner;

public class Assignment_31_4 {
	
	//perfect number in given range
	void getPerfectNumber(int startNumber, int endNumber) {
		int count=0;
		for(int index=startNumber; index<=endNumber; index++) {
			int sum=0;
			for(int innerIndex=1; innerIndex<=index/2; innerIndex++) {
				if(index%innerIndex==0) 
					sum += innerIndex;
			}
			if(sum==index) {
				System.out.println(index);
				count++;
			}
		}
		if(count==0)
			System.out.println("There is no perfect squares in this range");
	}
	
	public static void main(String[] args) {
		Assignment_31_4 assignment_31_4 = new Assignment_31_4();
		int startNumber, endNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start number: ");
		startNumber = scanner.nextInt();
		System.out.println("Enter end number: ");
		endNumber = scanner.nextInt();
		assignment_31_4.getPerfectNumber(startNumber,endNumber);
		scanner.close();
	}
}
