package aniket;

/*Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------
-----------------------------------------------  
*/
public class Assignment_31_4 {

	int getPerfect_Number(int num) {
		int sum = 0;
		for (int index = 1; index <= num / 2; index++) {
			if (num % index == 0)
				sum += index;
		}

		/*
		 * if (sum == num) { System.out.println(num + " is a perfect number"); //return
		 * true; } else {
		 * 
		 * System.out.println(num + " not a perfect number"); //return false; }
		 */
		return sum;
	}

	void isPerfectNumber(int startIndex, int lastIndex) {
		
		int countPerfectNumber=0;
		for (int index = startIndex; index <= lastIndex; index++) {
			int sum = getPerfect_Number(index);	
			if(sum==index) {
				System.out.println("Given number " + index + " is a perfect number");
				countPerfectNumber++;
			}
		}
		
		if(countPerfectNumber==0)
			System.out.println("There is no perfect number exist in the given range");
			

	}

	public static void main(String[] args) {
		Assignment_31_4 assignment_31_4 = new Assignment_31_4();
		assignment_31_4.isPerfectNumber(40, 170);
		//assignment_31_4.isPerfect_Number(10);
	}
}
