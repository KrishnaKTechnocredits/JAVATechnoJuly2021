//differenceofeven length name and odd length name

package sneha;

public class Assignment_15_1 {
	
	int getEvenAndOddLengthDifference(String[] arr) {
		int even = 0,odd = 0;
		
		for(int index = 0; index< arr.length; index++) {
			if((arr[index].length()) % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		return even - odd;
	}

	public static void main(String[] a) {
		int res = 0;
		String[] arr = {"sneha", "sunil","danave","ankita","hi"};
		Assignment_15_1 assignment_15_1 = new Assignment_15_1();
		res = assignment_15_1.getEvenAndOddLengthDifference(arr);
		System.out.println("Differnece is "+ res);
	}
}
