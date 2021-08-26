package indrani;

public class Assignment_19_program4{
	
	int findSum(String str){
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
		
		Assignment_19_program4 program4 = new Assignment_19_program4();
		String str = "10 10 20 30";
		int sum = program4.findSum(str);
		System.out.println("The sum of the numbers in the given string \'" + str + "\' is: " + sum);

	}

}