package sayli_Vyavhare;

public class StringLength_withoutBiuiltinMethods_Assign43 {

	static void getLength(String input) {
		int count = 0;
		String str = "";

		while (true) {
			try {
				str = str + input.charAt(count);
				count++;
				
			} catch (StringIndexOutOfBoundsException se) {
				System.out.println("String length is: "+ count);

				break;
			}
		}
	}

	public static void main(String[] args) {
		StringLength_withoutBiuiltinMethods_Assign43.getLength("Strength");

	}
}
