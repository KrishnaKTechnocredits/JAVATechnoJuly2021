package paresh.assignment20;

/*program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2*/

public class DuplicateCharInString {
	
	void printFreqOfEachChar(String input) {
		System.out.println("Duplicate characters in a string : ");
		for(int index=0; index <input.length();index++) {
			int count =0;
			char ch = input.charAt(index);
			if(index == input.indexOf(input.charAt(index)))
				for(int j=0; j <input.length();j++) {
						if(input.charAt(j) == ch  )	{
							count++;
						}
				}
			if(count > 1)
					System.out.println(ch+"->"+count);
		}
	}
	public static void main(String[] args) {
		DuplicateCharInString duplicateCharInString = new DuplicateCharInString();
		duplicateCharInString.printFreqOfEachChar("aakanksha");	
	}
}