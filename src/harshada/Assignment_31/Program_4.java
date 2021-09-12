package harshada.Assignment_31;

public class Program_4 {

	void getPerfectNumber(int num) {
		int sum=1; // make sum as always 1 becoz 1 is divisor by all numbers so include it.
		
		for(int index=2; index <= num/2; index++) { //start loop by 2
			if(num % index==0) {// mod by index not by 2- I did mistake here
				sum=sum+index;
			}
		}
		if(sum==num) {
			System.out.println(num);
		}
		
	}
	
	void perfectNumInRange(int start, int end) {
		for(int i=start; i<end; i++) {
			getPerfectNumber(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_4 program_4=new Program_4();
		int start=4;
		int end=8250;
		System.out.println("Perfect Numbers between "+ start+ " and "+ end + " are :");
		program_4.perfectNumInRange(start, end);
	}

}
