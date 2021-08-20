/*program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits*/
package monika;
public class Assignment19_Program_2 {

	String findMaxWordLength(String str) {
		int max=0;
		String newString="";
		String[] arr=str.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(arr[index].length()>max) {
				max=arr[index].length();
				newString=arr[index];
			}
		}
		return newString;
	}
	public static void main(String[] args) {
		Assignment19_Program_2 assignment19_Program_2= new Assignment19_Program_2();
		String str= "good morning technocredits hi hello";
		String maxLength=assignment19_Program_2.findMaxWordLength(str);
		System.out.println("The Maximum Length word in the given String '"+str+"' is :'"+maxLength+"'\nThe max Length is: " +maxLength.length());
		
	}
}
