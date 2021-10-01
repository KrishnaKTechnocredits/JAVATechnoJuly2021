/*To find length of string without uing .lenght( method)
*/
package bhakti;

import java.util.Arrays;

public class Assignment_43 {
	// m1
	void findLenghtWithArrat(String input) {
		char[] ch=  input.toCharArray();
		System.out.println(ch.length);
	}
	
	//m2 
	void findStringSizeWithoutLenght(String input) {
		int count=0;
		while (true) {
			try {	
				char ch =input.charAt(count);
				count++;
			}catch (StringIndexOutOfBoundsException e) {
				 
				break;
			}
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Assignment_43 a= new Assignment_43();
		a.findLenghtWithArrat("technocredits");
		a.findStringSizeWithoutLenght("technocredits");
	}
}
