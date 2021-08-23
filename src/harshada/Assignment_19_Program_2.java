/* program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

*/
package harshada;

public class Assignment_19_Program_2 {

	void getMaximumWordLength(String input) {
		input=input.replace(',', ' ').replace('.',' ').replace("  "," ").replace('-',' ');		//replace characters by space
		String array[]=input.split(" ");//now split string by space, use double quotes
		// now check length of each array 
		String maxWord=array[0];
		int maxSize=array[0].length();
		for(int index=0 ; index< array.length ; index++ ) {
		
			if(array[index].length() > maxSize) {
				maxSize=array[index].length();
				maxWord=array[index];
			}
		}
		System.out.println("String is: "+ input);
		System.out.println("Size of the maximum word is= : "+ maxSize);
		System.out.println("Word of maximum length is= : "+ maxWord+ "\n");
	}
	
	public static void main(String a[]) {
		Assignment_19_Program_2 assignment_19_P2=new Assignment_19_Program_2();
		String input1="Hi Techno Credits Hello";
		assignment_19_P2.getMaximumWordLength(input1);
		String input2="Head office of State Bank of India is in Mumbai, Maharashtra.";
		assignment_19_P2.getMaximumWordLength(input2);
	}
}
