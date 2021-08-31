

/*Convert all lowercase to uppercase and uppercase to lowercase in a given String.

Input: A1ashVi6
Output: a1ASHvI6*/
package elizabeth;
import java.util.Scanner;

class CodingTest2{
	
	String getOutput(String input){
		String output=" ";
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			boolean flag=Character.isLetter(ch);
			if(flag){
				if(Character.isUpperCase(ch)){
					ch=Character.toLowerCase(ch);
				}else if(Character.isLowerCase(ch)){
					ch=Character.toUpperCase(ch);
				}
				output=output+ch;
			}else{
				output=output+ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args){
		CodingTest2 codingTest2=new CodingTest2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=scanner.next();
		System.out.println("Output is: ");
		System.out.println(codingTest2.getOutput(input));
	}
}