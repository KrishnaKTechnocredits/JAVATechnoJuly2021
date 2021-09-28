package himanshu_Exception_Handling;

public class Assignment_40 {

	void getNumbersFromString(String[] input) {
		int temp = 0;
		
		for (int index = 0; index < input.length; index++) {
			try {
				temp = Integer.parseInt(input[index]);
				System.out.println(temp);
			} catch (NumberFormatException nfe) {

			}
		}
	}

	public static void main(String[] args) {

		String str = "I have 15 years and 3 months of exp";
		String[] input = str.split(" ");

		Assignment_40 ass_40 = new Assignment_40();
		ass_40.getNumbersFromString(input);
	}
}
