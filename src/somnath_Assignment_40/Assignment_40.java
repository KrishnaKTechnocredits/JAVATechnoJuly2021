
package somnath_Assignment_40;
public class Assignment_40 {

	void getNum(String[] input) {
		int a = 0;

		for (int index = 0; index < input.length; index++) {
			try {
				a = Integer.parseInt(input[index]);
				System.out.println(a);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {

		String str = "I have 15 years and 3 months of exp";
		String[] input = str.split(" ");

		Assignment_40 assignment_40 = new Assignment_40();
		assignment_40.getNum(input);
	}
}
