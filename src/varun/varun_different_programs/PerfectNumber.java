package varun.varun_different_programs;

public class PerfectNumber {
	int sum=0;
	void perfectNum(int num) {
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum +=i;
		}
		if(num == sum)
			System.out.println("Given Number " +num+ " is a perfect number ");
		else
			System.out.println("Given Number " +num+ " is not a perfect number ");
	}
	public static void main(String[] args) {
		PerfectNumber perfectNumber =  new PerfectNumber();
		perfectNumber.perfectNum(6);
		perfectNumber.perfectNum(8);
	}
}
