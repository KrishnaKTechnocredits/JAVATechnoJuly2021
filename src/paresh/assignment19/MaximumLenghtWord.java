package paresh.assignment19;

/*program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits*/

public class MaximumLenghtWord {
	
	public static void main(String[] args) {
		//MaximumLenghthWord maximumLenghtWord = new MaximumLenghtWord();
		String input = "good morning technocredits hi hello";
		String maximumWord = "";
		String [] output = input.split(" ");
		for(int index =0;index < output.length;index++) {
			if(output[index].length() > maximumWord.length()) {
				maximumWord = output[index];
				//System.out.println(output[index]+"-->"+output[index].length());
			}		
		}
		System.out.println("Maximum lenght word : "+maximumWord);
	}
}