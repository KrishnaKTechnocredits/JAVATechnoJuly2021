/*program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/
package monika;

public class Assignment19_Program_4 {

	int getSum(String str) {
		String arr[] = str.split(" ");
		int num[] = new int[arr.length];
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			num[index] = Integer.parseInt(arr[index]);
			sum += num[index];
		}

		return sum;
	}

	public static void main(String[] args) {
	
		Assignment19_Program_4 assignment19_Program_4 = new Assignment19_Program_4();
		String str = "10 10 20 30";
		int sum = assignment19_Program_4.getSum(str);
		System.out.println("The sum of the numbers in the given string '" + str + "' is: " + sum);

	}

}
