package prerana;

public class Assigntment24 {

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
		Assigntment24 a=new Assigntment24();
		String str="technocredits";
		System.out.println("Vowels are: ");
		a.getVowels(str);

	}

}





