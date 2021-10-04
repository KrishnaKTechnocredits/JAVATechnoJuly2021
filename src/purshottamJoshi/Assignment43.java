package purshottamJoshi;

public class Assignment43 {

	void checklength(String msg) {
		//1st approach

		char[] ch = msg.toCharArray();
		System.out.println(ch.length);
		
		//2nd approach
		int count=0;
		while(true) {
			try {
				char ch1 =msg.charAt(count);
				count++;
			}
			/*finally{
			break;
			}*/
			catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		String str = "technocredits";
		new Assignment43().checklength(str);
	}

}
