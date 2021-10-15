package dattaraj;

public class Assignment_42_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "technocredits";
		Assignment_42_P1 p1 = new Assignment_42_P1();
		p1.removeMultipleOcc(string);
	}
	
	void removeMultipleOcc(String str) {
		String str1 = "";
		System.out.println("After removing multiple characters from string '" + str + "'");
		System.out.print("Output is- ");
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
				if(!str1.contains(Character.toString(ch))) {
					str1 += ch;
				}
			}
			else
				str1 += ch;
		}
		System.out.println(str1);
	}
}
