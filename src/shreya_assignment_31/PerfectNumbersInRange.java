package shreya_assignment_31;

public class PerfectNumbersInRange {
	void getPerfectNumber(int startRange,int endRange) {
		for(int num=startRange;num<=endRange;num++) {
			int sum = 0;
			for(int index = 1;index < num;index++) {
				if(num % index == 0)
					sum = sum + index;
			}
			if(sum == num)
				System.out.println("Perfect number in a given range : "+num);
			
				
		}
		System.out.println("No Perfect numbers are present in given range");
	}
		
	
	public static void main(String[] args) {
		PerfectNumbersInRange perfectNumbersInRange=new PerfectNumbersInRange();
		perfectNumbersInRange.getPerfectNumber(40, 170);

	}

}
