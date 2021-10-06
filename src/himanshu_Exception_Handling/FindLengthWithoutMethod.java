package himanshu_Exception_Handling;

public class FindLengthWithoutMethod {

	void getStringLength(String str) {

		int count = 0;

		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println("String Length is : " + count);
	}

	public static void main(String[] args) {

		String str = "technocredits";

		FindLengthWithoutMethod ex = new FindLengthWithoutMethod();
		ex.getStringLength(str);
	}
}
