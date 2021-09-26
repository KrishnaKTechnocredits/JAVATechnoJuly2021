package shreya_assignment_31;

import java.util.Scanner;

public class PerfectNumber {
	int sum=0;
    void getPerfectNumber(int input) {
    	for(int index=1;index<input;index++) {
    		if(input%index==0) {
    			sum+=index;
    		}
    		
    	}
    	if(sum==input) {
			System.out.println(input+" is a perfect number");
		}
		else {
			System.out.println(input+" is not a perfect number");
		}
    }

	public static void main(String[] args) {
		PerfectNumber perfectNumber = new PerfectNumber();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        perfectNumber.getPerfectNumber(num);
        System.out.println("Enter the another number");
        int num1=scanner.nextInt();
        perfectNumber.getPerfectNumber(num1);
        
        
        //System.out.println(num);
        }

}
