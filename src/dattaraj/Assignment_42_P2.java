package dattaraj;

public class Assignment_42_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "technocredits";
		Assignment_42_P2 p2 = new Assignment_42_P2();
		p2.removeDuplicateOcc(str);
	}
	void removeDuplicateOcc(String str) {
		System.out.println("After removing duplicate characters from string '" + str + "'");
		System.out.print("Output is- ");
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
}
