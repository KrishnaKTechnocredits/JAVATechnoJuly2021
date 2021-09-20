/*Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i
*/
package deepak.assignment_24;

public class Vowels {
	
	void vowelPrint(String str){
		System.out.print("Vowels are: ");
		for(int index = 0; index<str.length(); index++){
			
			char ch = str.charAt(index);
			if(ch == 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u') {
				if((str.lastIndexOf(ch) != index) || str.indexOf(ch) ==str.lastIndexOf(ch)) {
					System.out.print(ch+", ");
				}
			}
				
		}
	}
	
	public static void main(String[] args) {
		Vowels obj = new Vowels();
		obj.vowelPrint("Technocredits");

	}

}
