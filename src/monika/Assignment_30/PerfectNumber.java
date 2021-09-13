package monika.Assignment_30;

public class PerfectNumber {

	void perfectNumber(int number) {
		int sum=0;
		for(int index=1; index<number; index++)
		{
			if(number % index==0)
				sum+=index;
			
		}
		if(sum==number)
			System.out.println(number+ " is Prfect Number");
		else
			System.out.println(number+ " is not Prfect Number");
	}
	public static void main(String[] args) {
		PerfectNumber perfectNo=new PerfectNumber();
		perfectNo.perfectNumber(28);
		
	}
}
