package rushikesh;

public class Assignment_17 {
	
	String getReverseString(String input){
		String output = "";

	    for (int i = input.length() - 1; i >= 0; i--) {
	        output = output + input.charAt(i);
	    }
	    return output;
	}
	
	public static void main(String[] args) {
		Assignment_17 assignment_17=new Assignment_17();
		System.out.println(assignment_17.getReverseString("technocredits"));
		
	}
}



