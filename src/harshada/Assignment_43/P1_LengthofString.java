package harshada.Assignment_43;

public class P1_LengthofString {

	void calculateLength(String s) {

		int count = 0;

		while (true) {

			try {
				char ch = s.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				// System.out.println();
				break;
			}

		}
		System.out.println("Length of the String  " + s + " is =" + count);
	}

	void calculateLengthUsingLengthfun(String str) {

		int count = 0;

		for (int index = 0; index < str.length(); index++) {

			count++;

		}

		System.out.println("Length of the String  " + str + " is =" + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1_LengthofString obj = new P1_LengthofString();
		obj.calculateLength("harshada");
		obj.calculateLengthUsingLengthfun("harshada");
	}

}
