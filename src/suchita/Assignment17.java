package suchita;

class Assignment17 {

	String getReverseString(String arr) {
		
		String reverse = " ";
		for(int index=arr.length()-1;index>=0;index--) {
			reverse += arr.charAt(index);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		
		 
		Assignment17 assignment = new Assignment17();
		System.out.println(assignment.getReverseString("technocredits"));
	}
}