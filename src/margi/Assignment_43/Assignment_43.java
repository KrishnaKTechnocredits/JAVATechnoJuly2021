package margi.Assignment_43;

//get string length without using length as a method and property
public class Assignment_43 {

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
		Assignment_43 assignment_43 = new Assignment_43();
		String str = "technocredits";
		System.out.println(str + ": " + assignment_43.getLength(str));
	}
}
