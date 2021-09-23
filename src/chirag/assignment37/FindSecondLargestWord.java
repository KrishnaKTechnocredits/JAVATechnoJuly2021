package chirag.assignment37;

/*
 *Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family
 */

public class FindSecondLargestWord {
	
	void getSecondLargestWord(String input) {
		String [] output = input.split(" ");
		String maximum="";
		String secondMaximum ="";
		for(int index=0;index < output.length;index++) {
				if(output[index].length() > maximum.length()) {
					secondMaximum=maximum;
					maximum=output[index];
				}
				else if(output[index].length() > secondMaximum.length() && 
						output[index].length() != maximum.length() ) {
					secondMaximum=output[index];
				}
			}
		System.out.println("Second largest word : "+secondMaximum);
		}
	
	public static void main(String[] args) {
		FindSecondLargestWord findSecondLargestWord=new FindSecondLargestWord();
		String input="Welcome to the family";
		findSecondLargestWord.getSecondLargestWord(input);
	}
}