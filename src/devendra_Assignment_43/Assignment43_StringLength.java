package devendra_Assignment_43;

public class Assignment43_StringLength {
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
		Assignment43_StringLength obj = new Assignment43_StringLength();
		String str = "technocredits";
		System.out.println("String Length of " + str + " : " + obj.getLength(str));
	}
}

/*
get string length without using length as a method and property
*/