package shantanu.findLengthOfString_assignment43;
/* Find length of the string without using length property of array or length() method of string*/

public class FindStringLength {
	int getLength(String str) {
		int count = 0;
		while(true) {
			try {
				str.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		FindStringLength findStringLength = new FindStringLength();
		String str = "technocredits";
		System.out.println("Length of string is: "+findStringLength.getLength(str));
	}
}
