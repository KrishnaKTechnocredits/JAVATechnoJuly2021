package dattaraj;

public class Assignment38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println(new Assignment38().getSubstring(input, "Hi", "Globant"));
	}

	private String getSubstring(String input, String string1, String string2) {
		// TODO Auto-generated method stub
		int strindex = input.lastIndexOf(string1);
		int endindex = input.indexOf(string2);
		//System.out.println(strindex);
		//System.out.println(endindex);
		
		if(strindex < endindex ) {
			return input.substring(strindex, endindex+string2.length());
		}else {
			return null;
		}
	}

}
