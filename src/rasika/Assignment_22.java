package rasika;

public class Assignment_22 {
	
	int getSumOfNumbers(String input){
		int Sum = 0;
		int totalNumbers = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) {
				totalNumbers++;
				Sum = Sum + Integer.parseInt(input.charAt(index)+ "");
			}
		}
		System.out.println("Total numbers in string are "+totalNumbers);
		return Sum;
	}

	public static void main(String[] args) {
		Assignment_22 assignment_22 = new Assignment_22();
		int sum =assignment_22.getSumOfNumbers("Te11ch2no3cr4edi2ts");
		System.out.println("The total of numbers in string is "+sum);
	}
}
