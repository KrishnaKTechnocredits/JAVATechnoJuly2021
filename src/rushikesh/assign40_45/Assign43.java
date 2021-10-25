package rushikesh.assign40_45;

public class Assign43 {
	public static void main(String[] args) {
		
		String str = "technocredits";
		Assign43 assign43 = new Assign43();
		assign43.getLength(str);
	}

	void getLength(String input) {
		int count = 0;
		while(true) {
			try {
				input.charAt(count);
				count++;
			} catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("The length of string '" + input + "' is " + count);
	}
}
