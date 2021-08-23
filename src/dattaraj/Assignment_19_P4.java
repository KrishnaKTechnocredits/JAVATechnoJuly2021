package dattaraj;

public class Assignment_19_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19_P4 assign19_p4 = new Assignment_19_P4();
		String input = "10 10 20 30";
		System.out.println("Sum is: " + assign19_p4.sumNum(input));
	}

	int sumNum(String input) {
		int sum=0;
		String[] splitString = input.split(" ");
		for (int index = 0; index < splitString.length; index++) {
			sum += Integer.parseInt(splitString[index]);
		}
		return sum;
	}

}
