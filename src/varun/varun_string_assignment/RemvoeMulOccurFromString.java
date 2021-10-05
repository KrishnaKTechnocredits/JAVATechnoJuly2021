package varun.varun_string_assignment;

public class RemvoeMulOccurFromString {
	
	void removeMultipleOccurence(String str) {
		String output ="";
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
				if(str.indexOf(ch)==index)
					output = output+ch;
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		String input = "technocredits";
		RemvoeMulOccurFromString remvoeMulOccurFromString = new RemvoeMulOccurFromString();
		remvoeMulOccurFromString.removeMultipleOccurence(input);
	}
}
