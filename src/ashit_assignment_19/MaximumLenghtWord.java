package ashit_assignment_19;

public class MaximumLenghtWord {

	public static void main(String[] args) {
		//MaximumLenghthWord maximumLenghtWord = new MaximumLenghtWord();
		String input = "Good morning to all of you";
		String maximumWord = "";
		String [] output = input.split(" ");
		for(int index =0;index < output.length;index++) {
			if(output[index].length() > maximumWord.length()) {
				maximumWord = output[index];
				System.out.println(output[index]+"-->"+output[index].length());
			}		
		}
		System.out.println("Maximum lenght word : "+maximumWord);
	}
	
}