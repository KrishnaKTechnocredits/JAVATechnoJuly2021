package shraddha.Assignment43;

public class LengthOfStringWithoutMethod {

	public static void main(String[] args) {
		int count = 0;
		String s = "technocredits";
		while (true) {
			try {
				s.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException sie) {
				break;
			}
		}
		System.out.println("Length ofthe String " + s + " is :- " + count);
	}

}
