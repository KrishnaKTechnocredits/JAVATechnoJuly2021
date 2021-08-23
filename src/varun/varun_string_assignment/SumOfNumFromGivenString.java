package varun.varun_string_assignment;

public class SumOfNumFromGivenString {
	
	int getSumOfAllNum(String arr) {
		int sum =0;
		String[] input = arr.split(" ");
		for(int index =0;index<input.length;index++) {
			sum += Integer.parseInt(input[index]);
		}
				return sum;
	}

	public static void main(String[] args) {
		SumOfNumFromGivenString assignment_19_4 = new SumOfNumFromGivenString();
		String input = "10 10 20 30";
		System.out.println(assignment_19_4.getSumOfAllNum(input));
	}
}
