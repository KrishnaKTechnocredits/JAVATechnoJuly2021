package amol_Pawar.assignment_40;

public class Assignment_40 {

	void getNumFromString(String input) {
		String arr[] = input.split(" ");
		System.out.println("Numbers from string " + input + " is given below");
		for (int index = 0; index < arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				System.out.print(num + " ");
			} catch (NumberFormatException ex) {
			}
		}
	}

	public static void main(String[] args) {
		Assignment_40 assignment_40 = new Assignment_40();
		String str = "I have 15 years and 9 months of exp";
		assignment_40.getNumFromString(str);
	}
}
