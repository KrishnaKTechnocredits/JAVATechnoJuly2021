/*Program 3 : verify given number is a perfect number or not.
*/
package monika;

public class Assignment30_Program_3 {
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
		Assignment30_Program_3 perfectNo=new Assignment30_Program_3();
		perfectNo.perfectNumber(28);
	}
}
