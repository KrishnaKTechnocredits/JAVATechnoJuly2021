package harshada.Assignment41_47;

public class Assignment_43 {

	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_43 assignment_43=new Assignment_43();
		assignment_43.calculateLength("harshada");
	}

}
