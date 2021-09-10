package husain.CodingTest6;

public class NonRepeating {
	
	void findNonRepeating(String str) {
		
		
		char ch = 0;
		for(int index = 0; index < str.length(); index++) {
			if(str.lastIndexOf(str.charAt(index))==index) {
				ch = str.charAt(index);
				break;
			}
		}
		
		System.out.println("The first non-repeating character in "+str+" is "+ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonRepeating obj = new NonRepeating();
		String str = "international";
		obj.findNonRepeating(str);

	}

}
