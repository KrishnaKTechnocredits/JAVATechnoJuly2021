//Write a method to find out required numbers to generate sum more than 100.
//output : 14


package sneha;

public class Assignment_11_2 {
	
	int findRequiredNumbers() {
		int sum = 0;
		int i = 1;
		int count = 0;
		while(sum <= 100) {
			sum = sum + i;
			i++;
			count++;
		}
		return count;
	}

	public static void main(String[] a) {
		int res = 0;
		Assignment_11_2 assignment_11_2 = new Assignment_11_2();
		res = assignment_11_2.findRequiredNumbers();
		System.out.println("Required numbers are: " + res);
	}
}
