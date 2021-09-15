package shreya_assignment24;

public class DisplayVowels {
	void getVowels(String input) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if((input.charAt(index)=='a')||(input.charAt(index)=='e')||(input.charAt(index)=='i')||(input.charAt(index)=='o')||(input.charAt(index)=='u')) {
				char ch=input.charAt(index);
				if(index==input.indexOf(ch))
					System.out.println(ch);
			}
		}
	}
	public static void main(String[] args) {
		DisplayVowels displayVowels=new DisplayVowels();
		String str="technocredits";
		System.out.println("Vowels are: ");
		displayVowels.getVowels(str);

	}

}
