package himanshu_string_assignment;

public class Assignment_42 {
	
	void removeMultipleOccurenceMethod(String input) {
		String output = "";
		
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(input.indexOf(ch) == index){
			output = output + input.charAt(index);
			}
		}
		System.out.println(output);
	}

	void removeAllRepeatingMethod(String input) {  
		String output="";
		for(int index=0; index < input.length(); index++) {
			char ch=input.charAt(index);
			if(input.indexOf(ch)== input.lastIndexOf(ch)) { 
				output +=input.charAt(index);

			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		
		String input = "technocredits";

		Assignment_42 ass_42 = new Assignment_42();
		ass_42.removeMultipleOccurenceMethod(input);
		ass_42.removeAllRepeatingMethod(input);
	}

}
