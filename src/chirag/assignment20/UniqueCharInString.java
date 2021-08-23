package chirag.assignment20;

public class UniqueCharInString {
	
	void printFreqOfEachChar(String input) {
		System.out.println("Unique characters in a string : ");
		for(int index=0; index <input.length();index++) {
			int count =0;
			char ch = input.charAt(index);
			if(index == input.indexOf(input.charAt(index)))
				for(int j=0; j <input.length();j++) {
						if(input.charAt(j) == ch  )	{
							count++;
						}		
				}
			if(count == 1)
					System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		UniqueCharInString uniqueCharInString = new UniqueCharInString();
		uniqueCharInString.printFreqOfEachChar("Prajapati");
	}
}