package swati.Assignment43;

/*WAP to find length of String without using Length Method and length property.
String input="technocredits";
output=13;*/

public class Assignment43 {
	
	void findStringLength(String input) {
		
		int count=0;
		while(true) {
			try {
			input.charAt(count);
			count++;
			}catch(IndexOutOfBoundsException ie) {
				break;
			}
		}
		System.out.println("Output: "+count);
	}

	public static void main(String[] a) {
		Assignment43 a1=new Assignment43();
		a1.findStringLength("technocredits");
	}
}