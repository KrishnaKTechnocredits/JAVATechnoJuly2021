/*
 * DATE:30-8-21
 Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
 */
package harshada;


public class HarshadaCodingTest2 {

	void convertUpperCaseToLowerCase(String str) {
		char ch;
		String tempStr="";
		System.out.println("Original String is: "+str );
		for(int index=0; index< str.length(); index++) {
			ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				//no operation
				tempStr=tempStr+ch;
			}
			else {
				if(Character.isUpperCase(ch)) {
					tempStr=tempStr+Character.toLowerCase(ch);
				}
				else if(Character.isLowerCase(ch)) {
					tempStr=tempStr+Character.toUpperCase(ch);
				}
			}//else loop close
		}//for loop close
		System.out.println("Converted String is: "+tempStr );
	}//method close
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarshadaCodingTest2 codingTest2=new HarshadaCodingTest2();
		codingTest2.convertUpperCaseToLowerCase("123HeLlO234B");

	}

}
