package margi.Assignment_25;

public class Assignment_25_1 {

	//sum of numbers
	int getSumOfNumbers(String input) {
		int sum = 0;
		String temp = "";
		char ch;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				temp += String.valueOf(ch);
			}
			else
				temp += " ";
		}
		temp = temp.trim();
		temp = temp.replaceAll("\\s+"," ");
		String[] arr = temp.split(" ");
		for(int index=0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment_25_1 assignment_25_1 = new Assignment_25_1();
		String str = "te12ch33no3credit4s";
		System.out.println("Sum is: " + assignment_25_1.getSumOfNumbers(str));
	}
}
