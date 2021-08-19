package purshottamJoshi;

class Assignment18{
	
	String getReverse(String str) {  
		String output="";  
		for(int i=str.length()-1; i>= 0; i--) {  
			output = output + (str.charAt(i));   
		}  
		return output;  
	}

	void getReverseString(String[] input) {
		for(int index = 0; index < input.length; index++) {
			String rev =	getReverse(input[index]);
			System.out.println(rev);
		}
	}	
	String[] getReverseStringArray(String[] input) {
		for(int index = 0; index < input.length; index++) {
		input[index] = getReverse(input[index]);
		}
		return input;
	}
	public static void main(String[] args){
		
		Assignment18 assignment18 = new Assignment18();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		assignment18.getReverseStringArray(input);
		for(int index=0; index <input.length; index++){
				System.out.println(input[index]);
		}
	}
}