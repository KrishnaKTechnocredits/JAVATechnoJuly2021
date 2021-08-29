package husain.Assignment25;

public class Program2 {

	String findUpperCase(String str) {

		String temp1 = "";
		String temp2 = "";
		String temp3 = "";

		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				temp1 = temp1 + str.charAt(index);
			else if (Character.isDigit(str.charAt(index)))
				temp2 = temp2 + str.charAt(index);
			else
				temp3 = temp3 + str.charAt(index);

		}

		return temp1 + temp2 + temp3;
	}

	void loopArray(String str) {
		String arr[] = str.split(" ");

		for (int index = 0; index < arr.length; index++)
			arr[index] = findUpperCase(arr[index]);

		displayString(arr);
	}

	void displayString(String arr[]) {
		String str = "";

		for (int index = 0; index < arr.length; index++)
			str = str + arr[index] + " ";

		System.out.println("Rearranged string: "+ str.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		String str = "TechnOCr12ed3itS Hu6SA45iN";
		System.out.println("Input String: " +str);
		obj.loopArray(str);

	}

}
