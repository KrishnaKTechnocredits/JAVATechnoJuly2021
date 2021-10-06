/*Assignment 43:
 	Get length of string without using length() function.
  */
	package deepak.assignment_43;

public class GetLength {

	void length(String str) {
		int cnt = 0;
		while (true) {
			try {
				str.charAt(cnt);
				cnt++;
			} catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("length of " + str + " is: " + cnt);
	}

	public static void main(String[] args) {
		GetLength obj = new GetLength();
		obj.length("Technocredits");

	}

}
