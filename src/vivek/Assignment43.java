/*Calculate the length of the string without using the length as a method and length as a property
 String input=technocredits
 output = 13*/

package vivek;

public class Assignment43 {

	static void getStringLength1(String str) {
		int cnt = 0;
		while (true) {
			try {
				str.charAt(cnt);
				cnt++;
			} catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("StringLength Alternative1 " + cnt);
	}

	static void getStringLength2(String str) {
		char[] charArray = str.toCharArray();
		int cnt = 0;
		for (char letter : charArray) {
			cnt++;
		}
		System.out.println("StringLength Alternative2 " + cnt);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		Assignment43.getStringLength1(str);
		Assignment43.getStringLength2(str);
	}
}
