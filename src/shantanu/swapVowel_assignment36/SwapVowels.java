package shantanu.swapVowel_assignment36;

public class SwapVowels {
	void displayOutput(String input) {
		//String inputStr = input.toLowerCase();
		String output = "", temp = "";
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index)=='a' || input.charAt(index)=='A' || input.charAt(index)=='e' || input.charAt(index)=='E' || input.charAt(index)=='i' || input.charAt(index)=='I' || input.charAt(index)=='o' || input.charAt(index)=='O' || input.charAt(index)=='u' || input.charAt(index)=='U')
				temp += input.charAt(index);
		}
        for(int newIndex = 0, tempIndex = temp.length()-1; newIndex < input.length(); newIndex++)
		{ 
        	if(input.charAt(newIndex)=='a' || input.charAt(newIndex)=='A' || input.charAt(newIndex)=='e' || input.charAt(newIndex)=='E' || input.charAt(newIndex)=='i' || input.charAt(newIndex)=='I' || input.charAt(newIndex)=='o' || input.charAt(newIndex)=='O' || input.charAt(newIndex)=='u' || input.charAt(newIndex)=='U')
        	{
        		output=output+temp.charAt(tempIndex);
        		tempIndex--;
        	}
        	else
        		output=output+input.charAt(newIndex);
		}
        System.out.println(output);
	}
	public static void main(String[] args) {
		SwapVowels swapVowels = new SwapVowels();
		String input = "Shantanu Ghanekar"; //hiurseoah
		swapVowels.displayOutput(input);
	}
}