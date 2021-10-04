package rasika_Assignment_43;
/*To find length of the string without length method using exception handling.*/

public class Program1 {
	
	int calculateLengthOfString(String string){
		int index = 0;
		try{
			for(; ;index++) {
				string.charAt(index);
			}
		}
			catch(StringIndexOutOfBoundsException si) {
				
		}
		return index;
	}
	
	int calculateLengthOfStringUsingWhileLoop(String string){
		int index = 0;
		try{
			while(true) {
				string.charAt(index);
				index++;
			}
		}
			catch(StringIndexOutOfBoundsException si) {
				
		}
		return index;
	}
	

	public static void main(String[] args) {
		String str = "Technocredits";
		String str1 = "RasikaNitinMahadik";
		Program1 program1 = new Program1();
		System.out.println(program1.calculateLengthOfString(str));
		System.out.println(program1.calculateLengthOfStringUsingWhileLoop(str1));
	}
}
